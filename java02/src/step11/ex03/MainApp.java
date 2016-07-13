/* 2단계: 메뉴 추가
 * Windows OS에서 한글 깨짐 처리
 * => Run Configuration > Java Application > 해당프로그램 > Arguments탭 > VM arguments
 *    "-Dfile.encoding=MS949" 입력  
 */
package step11.ex03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp extends Frame implements ActionListener {
  BoardPanel boardPanel = new BoardPanel();
  ProjectPanel projectPanel = new ProjectPanel();
  MemberPanel memberPanel = new MemberPanel();
  ContactPanel contactPanel = new ContactPanel();
  Panel currPanel;
  
  public MainApp() {
    super("비트캠프 울트라 예제");
    
    prepareMenu();
    
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    
    setSize(500, 400);
  }
  
  private void prepareMenu() {
    MenuBar menuBar = new MenuBar();
    setMenuBar(menuBar); // 메뉴바를 프레임 윈도우에 추가한다.

    Menu adminMenu = new Menu("관리");
    menuBar.add(adminMenu); // 관리 메뉴를 메뉴바에 추가한다.
    
    MenuItem boardMI = new MenuItem("게시판");
    boardMI.setActionCommand("board"); // 나중에 이벤트를 구분할 때 사용하기 위함.
    boardMI.addActionListener(this); // MainApp 자신이 ActionListener를 구현했다.
    adminMenu.add(boardMI); // 게시판 메뉴를 관리 메뉴에 추가한다.
    
    MenuItem projectMI = new MenuItem("프로젝트");
    projectMI.setActionCommand("project");// 나중에 이벤트를 구분할 때 사용하기 위함.
    projectMI.addActionListener(this);
    adminMenu.add(projectMI);
    
    MenuItem contactMI = new MenuItem("연락처");
    contactMI.setActionCommand("contact");// 나중에 이벤트를 구분할 때 사용하기 위함.
    contactMI.addActionListener(this);
    adminMenu.add(contactMI);
    
    MenuItem memberMI = new MenuItem("회원");
    memberMI.setActionCommand("member");// 나중에 이벤트를 구분할 때 사용하기 위함.
    memberMI.addActionListener(this);
    adminMenu.add(memberMI);
    
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    Panel selectedPanel = null;
    
    switch (e.getActionCommand()) {
    case "board": selectedPanel = boardPanel; break;
    case "project": selectedPanel = projectPanel; break;
    case "contact": selectedPanel = contactPanel; break;
    case "member": selectedPanel = memberPanel; break;
    }
    
    if (currPanel != selectedPanel) {
      if (currPanel != null) {
        remove(currPanel); // 기존에 출력된 패널이 있다면 제거한다.
      }
      add(selectedPanel, BorderLayout.CENTER);
      currPanel = selectedPanel;
      revalidate(); // 화면을 갱신하라!
    }
  }
  
  public static void main(String[] args) {
    MainApp app = new MainApp();
    app.setVisible(true);
  }
  
}











