package step11.ex06;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardPanel extends Panel implements ActionListener {
  TextArea listTA;
  TextField titleTF;
  TextField passwordTF;
  TextArea contentTA;
  Button addBtn;
  Button cancelBtn;
  
  BoardDao boardDao;
  
  public BoardPanel() {
    boardDao = new BoardDao();
    
    setLayout(new FlowLayout(FlowLayout.LEFT));
    
    Label label = new Label("게시판 화면");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);

    label = new Label("게시물 목록");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);
    
    listTA = new TextArea();
    listTA.setPreferredSize(new Dimension(400, 200));
    add(listTA);
    
    label = new Label("게시물 입력/상세정보");
    label.setPreferredSize(new Dimension(400, 30));
    add(label);
    
    Panel rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
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
    
    rowPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
    addBtn = new Button("등록");
    addBtn.addActionListener(this);
    rowPanel.add(addBtn);
    cancelBtn = new Button("취소");
    cancelBtn.addActionListener(this);
    rowPanel.add(cancelBtn);
    add(rowPanel);
    
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == addBtn) {
      Board board = new Board();
      board.title = titleTF.getText();
      board.contents = contentTA.getText();
      board.password = passwordTF.getText();
    
      boardDao.insert(board);

      // 애플리케이션에서 이벤트를 발생시키기
      // => 취소 버튼에 ActionEvent 보내기 => 사용자가 취소 버튼을 클릭하는 효과를 냈다.
      cancelBtn.dispatchEvent(new ActionEvent(cancelBtn, ActionEvent.ACTION_PERFORMED, null));
      
      loadList();
      
    } else {
      titleTF.setText("");
      contentTA.setText("");
      passwordTF.setText("");
    }
  }
  
  private void loadList() {
    listTA.setText("");
    
    Board[] boards = boardDao.selectList();
    for (Board board : boards) {
      listTA.append(
          board.title + "," + 
          board.writer + "," + 
          board.createdDate + "," + 
          board.viewCount + "\n");
    }
  }
}





