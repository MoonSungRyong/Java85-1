/* 2단계: 의존 객체 주입(Dependencies Injection)
 * => 각 객체가 자신이 사용할 객체를 준비하는 대신
 *    중앙에서 각 객체가 사용할 의존 객체를 생성하고 주입해준다. 
 */
package step14.ex05;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import step14.ex05.server.BoardDao;

public class MainApp extends Frame implements ActionListener {
  private static final long serialVersionUID = 1L;
  
  BoardPanel boardPanel;
  ProjectPanel projectPanel;
  MemberPanel memberPanel;
  ContactPanel contactPanel;
  BoardDao boardDao;
  ProjectDao projectDao;
  MemberDao memberDao;
  ContactDao contactDao;
  Connection con;
  
  CardLayout cardLayout = new CardLayout();
  
  public MainApp() {
    super("비트캠프 울트라 예제 v0.6 ");
    
    createObjects();
    injectDependencies();

    setLayout(cardLayout); // 레이아웃 관리자 교체: BorderLayout --> CardLayout
    prepareMenu();
    preparePanels();

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    
    setSize(500, 600);
  }
  
  private void createObjects() {
    boardPanel = new BoardPanel();
    projectPanel = new ProjectPanel();
    memberPanel = new MemberPanel();
    contactPanel = new ContactPanel();
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
      
      boardDao = new BoardDao();
      projectDao = new ProjectDao();
      memberDao = new MemberDao();
      contactDao = new ContactDao();
      
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "DAO 생성 중 오류가 발생했습니다.");
    }
  }
  
  private void injectDependencies() {
    boardDao.setConnection(con);
    projectDao.setConnection(con);
    memberDao.setConnection(con);
    contactDao.setConnection(con);

    boardPanel.setBoardDao(boardDao);
    projectPanel.setProjectDao(projectDao);
    memberPanel.setMemberDao(memberDao);
    contactPanel.setContactDao(contactDao);
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
  
  private void preparePanels() {
    add(boardPanel, "board"); 
    add(projectPanel, "project"); 
    add(memberPanel, "member"); 
    add(contactPanel, "contact"); 
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    cardLayout.show(this, e.getActionCommand());
    revalidate(); // 화면을 갱신하라!
  }
  
  public static void main(String[] args) {
    MainApp app = new MainApp();
    app.setVisible(true);
  }
  
}











