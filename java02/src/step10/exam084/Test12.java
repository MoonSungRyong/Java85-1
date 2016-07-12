/* 주제 : 이너 클래스 사용법 - 익명 이너 클래스2
 */
package step10.exam084;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test12 extends Frame {
  public Test12() {
    setLayout(new FlowLayout());
    
    Button btn = new Button("오호라");
    add(btn);
    
    /* 1) ActionListener를 로컬 이너 클래스로 구현
    class MyActionListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("오호라...눌렀음");
      }
    }
    btn.addActionListener(new MyActionListener());
    */
    
    /* 2) ActionListener를 익명 이너 클래스로 구현 
    ActionListener listener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("오호라...눌렀음");
      }
    };
    btn.addActionListener(listener);
    */
    
    // 인터페이스를 구현한 익명 이너 클래스 선언과 객체 생성
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("오호라.. 눌렀음");
      }
    });
    
    // 추상클래스를 상속받은 익명 이너 클래스의 선언과 객체 생성
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    setSize(300, 200);
  }
  public static void main(String[] args) {
    Test12 f = new Test12();
    f.setVisible(true);
  }
}





