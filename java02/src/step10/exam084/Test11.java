/* 주제 : 이너 클래스 사용법 - 익명 이너 클래스
 */
package step10.exam084;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test11 extends Frame {
  public Test11() {
    //1) 로컬 이너 클래스 
    /*
    class MyWindowListener extends WindowAdapter {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    }
    addWindowListener(new MyWindowListener());
    */
    
    //2) 익명 이너 클래스 
    // => 객체를 한 번 밖에 만들지 않을 거라면, 굳이 클래스를 정식으로 선언할 필요가 있는가?
    // => 단축 표기법을 이용하여 클래스 선언과 객체 생성을 한 번에 처리하자!
    /*
    WindowAdapter listener = new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener(listener);
    */
    
    //3) 익명 이너 클래스(실무)
    //   => 익명 이너 클래스의 인스턴스를 한 번만 사용한다면 따로 레퍼런스를 선언하지 말라!
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    setSize(300, 200);
  }
  public static void main(String[] args) {
    Test11 f = new Test11();
    f.setVisible(true);
  }
}





