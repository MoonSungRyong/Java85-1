package step10.exam080;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 윈도우 이벤트를 처리할 리스너 만들기
// 1) WindowListener 규칙을 직접 구현하기
// 2) WindowAdapter를 상속 받기
//
public class MyWindowListener2 extends WindowAdapter {
  // WindowAdapter를 상속 받으면 좋은 점?
  // 1) WindowListener의 모든 메서드를 미리 구현했다.
  // 2) 관심있는 이벤트에 대해서만 메서드를 오버라이딩하면 된다.
  // => 코드가 간결해진다.
  @Override
  public void windowClosing(WindowEvent e) {
    System.out.println("windowClosing");   
    System.exit(0);
  }

}







