package step10.exam080;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 윈도우 이벤트를 처리할 리스너 만들기
// 1) WindowListener 규칙을 직접 구현하기
// 2) WindowAdapter를 상속 받기
//
public class MyWindowListener extends WindowAdapter {
  // 윈도우 닫기 이벤트가 발생했을 때 호출될 메서드를 오버라이딩 하라!
  // 누가 호출하는가? JVM이다.
  // 이 메서드는 다음 메서드로 정해져 있다. 
  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }
}







