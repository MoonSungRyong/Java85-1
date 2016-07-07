/* 주제: OOP 문법 활용 - 이벤트 처리와 리스너
 */
package step10.exam080;

import java.awt.Frame;

public class MainApp extends Frame {
  
  public MainApp() {
    super("event");
    
    setSize(600, 480);
  }
  
  public static void main(String[] args) {
    MainApp f = new MainApp();
    
    // 사용자가 프로그램 닫기 버튼(x)을 클릭했을 때 JVM을 종료시킬 객체를 등록해야 한다.
    // WindowListener => WindowEvent를 처리하는 담당자
    f.addWindowListener(new MyWindowListener());
    
    f.setVisible(true);
  }
    
}

/* 용어정리
 * 1) 이벤트(event)
 *   => 사용자가 윈도우 객체를 클릭하거나 움직이는 등의 행위를 통해 전달하는 명령.
 *   => 윈도우 객체 내부에서 작업을 수행하면서 특정 상황을 외부에 전달하는 명령.
 *   => OS가 윈도우 객체나 프로그램에 전달하는 명령.
 *   => JVM이 윈도우 객체에 전달하는 명령.
 * 
 * 2) 리스너(listener) 또는 옵저버(observer)
 *   => 특정 이벤트에 대해 작업을 수행하는 객체
 *   => 사건(이벤트)이 발생하면 JVM은 그 사건을 처리할 담당자를 찾는다.
 *      만약 찾지 못했으면 그 사건을 무시하고,
 *      찾았으면 그 담당자를 실행한다.
 *      이때 사건을 처리하는 담당자를 "리스너 또는 옵저버"라 부른다.    
 * 
 * 3) 이벤트를 처리하는 방법?
 *   => 관심있는 이벤트에 대해 리스너(또는 옵저버)를 등록하면 된다.
 */







