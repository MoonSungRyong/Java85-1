package step14.ex05.client;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JOptionPane;

import step14.ex05.vo.Board;

public class BoardPanel extends Panel implements ActionListener {
  private static final long serialVersionUID = 1L;
  
  java.awt.List boardLST;
  TextField titleTF;
  TextField passwordTF;
  TextArea contentTA;
  Button addBtn;
  Button cancelBtn;
  Button deleteBtn;
  Button updateBtn;
  Panel toolPanel;
  
  public BoardPanel() {
    setLayout(new FlowLayout(FlowLayout.LEFT));
    
    Label label = new Label("게시판 화면");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);

    label = new Label("게시물 목록");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);
    
    Panel rowPanel = new Panel(new BorderLayout());
    rowPanel.setPreferredSize(new Dimension(400, 200));
    boardLST = new java.awt.List();
    boardLST.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.DESELECTED)
          return;
        loadForm((int)e.getItem()); // 해당 번호의 게시물 데이터를 입력폼으로 가져와라.
      }
    });
    rowPanel.add(boardLST, BorderLayout.CENTER);
    add(rowPanel);
    
    label = new Label("게시물 입력/상세정보");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);
    
    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    label = new Label("제목");
    label.setPreferredSize(new Dimension(40, 30));
    rowPanel.add(label);
    
    titleTF = new TextField();
    titleTF.setPreferredSize(new Dimension(350, 30));
    rowPanel.add(titleTF);
    add(rowPanel);
    
    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    label = new Label("내용");
    label.setPreferredSize(new Dimension(40, 30));
    rowPanel.add(label);
    
    contentTA = new TextArea();
    contentTA.setPreferredSize(new Dimension(350, 80));
    rowPanel.add(contentTA);
    add(rowPanel);
    
    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    label = new Label("암호");
    label.setPreferredSize(new Dimension(40, 30));
    rowPanel.add(label);
    
    passwordTF = new TextField();
    passwordTF.setPreferredSize(new Dimension(350, 30));
    passwordTF.setEchoChar('*');
    rowPanel.add(passwordTF);
    add(rowPanel);
    
    toolPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    addBtn = new Button("등록");
    addBtn.addActionListener(this);
    toolPanel.add(addBtn);
    cancelBtn = new Button("취소");
    cancelBtn.addActionListener(this);
    toolPanel.add(cancelBtn);
    deleteBtn = new Button("삭제");
    deleteBtn.setEnabled(false);
    deleteBtn.addActionListener(this);
    toolPanel.add(deleteBtn);
    updateBtn = new Button("변경");
    updateBtn.addActionListener(this);
    //toolPanel.add(updateBtn); // 처음에는 변경 버튼을 보이지 않는다.
    add(toolPanel);
    
    loadList();
  }
  

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addBtn) {
      Board board = new Board();
      board.setTitle(titleTF.getText());
      board.setContents(contentTA.getText());
      board.setPassword(passwordTF.getText());
      
      try {
        boardDao.insert(board);
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "DB에 저장하는 중 오류가 발생했습니다.");
      }

      loadList();

      // 애플리케이션에서 이벤트를 발생시키기
      // => 취소 버튼에 ActionEvent 보내기 => 사용자가 취소 버튼을 클릭하는 효과를 냈다.
      cancelBtn.dispatchEvent(new ActionEvent(cancelBtn, ActionEvent.ACTION_PERFORMED, null));
      
    } else if (e.getSource() == cancelBtn) {
      cleanForm();
      
    } else if (e.getSource() == deleteBtn) {
      if (!checkAuth()) {
        JOptionPane.showMessageDialog(null, "암호가 맞지 않습니다!");
        return;
      }
      
      int answer = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?", "삭제 알림!", 
          JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
      
      if (answer != JOptionPane.YES_OPTION)
        return;

      try {
        boardDao.delete(getSelectedBoardNo());
        
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "DB의 데이터 삭제 중 오류가 발생했습니다.");
      }
      cleanForm();
      loadList();
      
    } else if (e.getSource() == updateBtn) {
      if (!checkAuth()) {
        JOptionPane.showMessageDialog(null, "암호가 맞지 않습니다!");
        return;
      }
      
      Board board = new Board();
      board.no = getSelectedBoardNo();
      board.title = titleTF.getText();
      board.contents = contentTA.getText();
      
      try {
        boardDao.update(board);
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "DB의 데이터 변경 중 오류가 발생했습니다.");
      }
      cleanForm();
      loadList();
    }
  }

  private boolean checkAuth() {
    try {
      Board board = boardDao.selectOne(getSelectedBoardNo(), passwordTF.getText());
      if (board != null)
        return true;
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "DB 조회 중 오류가 발생했습니다.");
    }
    return false;
  }
  
  private void cleanForm() {
    titleTF.setText(" ");
    titleTF.setText("");
    contentTA.setText(" ");
    contentTA.setText("");
    passwordTF.setText(" ");
    passwordTF.setText("");
    
    deleteBtn.setEnabled(false);
    toolPanel.add(addBtn, 0); // 맨 앞에 버튼을 추가하라.
    toolPanel.remove(updateBtn);
    toolPanel.revalidate(); // 툴 패널을 다시 자리 배치하라.
    boardLST.deselect(boardLST.getSelectedIndex()); // 현재 선택된 것을 취소한다.
  }
  
  private void loadList() {
    boardLST.removeAll();
    
    try {
      List<Board> boards = boardDao.selectList();
      for (Board board : boards) {
        boardLST.add(
            board.getNo() + "," +
            board.getTitle() + "," + 
            board.getCreatedDate() + "," + 
            board.getViewCount());
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(null, "DB 조회 중 오류가 발생했습니다.");
    }
  }
  
  private void loadForm(int listItemIndex) {
    /*
    String data = boardLST.getItem(listItemIndex); // 예) "1,aaaa,2016-5-5,0"
    String[] arr = data.split(","); // 예) ["1","aaaa","2016-5-5","0"]
    int no = Integer.parseInt(arr[0]);
    */
    int no = Integer.parseInt(boardLST.getItem(listItemIndex).split(",")[0]);
    try {
      Board board = boardDao.selectOne(no);
      if (board == null) 
        return;
      
      titleTF.setText(board.title);
      contentTA.setText(board.contents);
      passwordTF.setText(" ");
      passwordTF.setText("");
      
      deleteBtn.setEnabled(true);
      
      toolPanel.remove(addBtn);
      toolPanel.add(updateBtn, 0);
      toolPanel.revalidate();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "DB 조회 중 오류가 발생했습니다.");
    }
    
  }
  
  private int getSelectedBoardNo() {
    return Integer.parseInt(boardLST.getSelectedItem().split(",")[0]);
  }
}





