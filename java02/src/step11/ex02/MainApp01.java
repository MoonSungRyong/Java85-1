/* 2단계: 메뉴 추가
 * Windows OS에서 한글 깨짐 처리
 * => Run Configuration > Java Application > 해당프로그램 > Arguments탭 > VM arguments
 *    "-Dfile.encoding=MS949" 입력  
 */
package step11.ex02;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp01 extends Frame {
  public MainApp01() {
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
    boardMI.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("board......");
      }
    });
    adminMenu.add(boardMI); // 게시판 메뉴를 관리 메뉴에 추가한다.
    
    MenuItem projectMI = new MenuItem("프로젝트");
    projectMI.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("project......");
      }
    });
    adminMenu.add(projectMI);
    
    MenuItem contactMI = new MenuItem("연락처");
    contactMI.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("contact.......");
      }
    });
    adminMenu.add(contactMI);
    
    MenuItem memberMI = new MenuItem("회원");
    memberMI.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("member.......");
      }
    });
    adminMenu.add(memberMI);
    
  }
  
  public static void main(String[] args) {
    MainApp01 app = new MainApp01();
    app.setVisible(true);
  }
  
}











