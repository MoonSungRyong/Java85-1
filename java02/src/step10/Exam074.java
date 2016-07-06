/* 주제: OOP 문법 활용 - 상속 활용 후
 * 
 */
package step10;

import java.awt.Frame;

public class Exam074 extends Frame {
  public Exam074() {
    super("윈도우 제목");
    
    /*this.*/setSize(400, 300); /* this는 생략 가능하다. */ 
  }

  
  public static void main(String[] args) {
    Exam074 f = new Exam074();
    f.setVisible(true);
  }

}







