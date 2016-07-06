/* 주제: OOP 문법 활용 - 배치 관리자 사용법 : FlowLayout 사용법
 */
package step10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Exam078 extends Frame {
  public Exam078() {
    super("Hello");
    
    Button btn1 = new Button("Button1");
    Button btn2 = new Button("Button2");
    Button btn3 = new Button("Button3");
    Button btn4 = new Button("Button4");
    Button btn5 = new Button("Button5");
    
    // Frame의 기본 레이아웃(BorderLayout)을 FlowLayout으로 교체하자!
    FlowLayout layoutManager = new FlowLayout();
    this.setLayout(layoutManager);
    
    // FlowLayout 배치 관리자는 위치를 지정할 필요가 없다. 더한 순서대로 나열한다.
    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    
    setSize(400, 300); 
  }

  
  public static void main(String[] args) {
    Exam078 f = new Exam078();
    f.setVisible(true);
  }

}







