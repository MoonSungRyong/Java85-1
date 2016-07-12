/* 주제 : 이너 클래스 사용법 - 익명 이너 클래스를 lambda라는 문법으로 단축 표기하기
 */
package step10.exam084;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test13 extends Frame {
  public Test13() {
    setLayout(new FlowLayout());
    
    Button btn = new Button("오호라");
    add(btn);
    
    // lambda 문법을 사용하여 ActionListener 구현체 만들기
    btn.addActionListener(e -> System.out.println("오호라.. 눌렀음"));
    
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
    Test13 f = new Test13();
    f.setVisible(true);
  }
}





