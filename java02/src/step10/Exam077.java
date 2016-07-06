/* 주제: OOP 문법 활용 - 배치 관리자 사용법 : BorderLayout (Frame 기본 배치 관리자)
 */
package step10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exam077 extends Frame {
  public Exam077() {
    super("Hello");
    
    Button btn1 = new Button("Button1");
    Button btn2 = new Button("Button2");
    Button btn3 = new Button("Button3");
    Button btn4 = new Button("Button4");
    Button btn5 = new Button("Button5");
    
    // BorderLayout 배치 관리자는 동/서/남/북/가운데로 자식 윈도우를 배치한다.
    add(btn1, BorderLayout.NORTH);
    add(btn2, BorderLayout.EAST);
    add(btn3, BorderLayout.SOUTH);
    add(btn4, BorderLayout.WEST);
    add(btn5, BorderLayout.CENTER);
    
    setSize(400, 300); 
  }

  
  public static void main(String[] args) {
    Exam077 f = new Exam077();
    f.setVisible(true);
  }

}







