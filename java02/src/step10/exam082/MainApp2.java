/* 주제: OOP 문법 활용 - 버튼 클릭 이벤트와 리스너
 */
package step10.exam082;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MainApp2 extends Frame {
  
  
  public MainApp2() {
    super("event");
    
    // Frame에 기본으로 설정되어 있는 배치관리자(BorderLayout)를 FlowLayout으로 교체하자!
    setLayout(new FlowLayout());
    
    Button btn = new Button("버튼1");
    add(btn); // FlowLayout의 경우 위치를 지정할 필요가 없다. 더해진 순서대로 좌에서 우로 출력한다.
    
    // 버튼을 눌렀을 때 보고 받고 싶다.
    // => 버튼의 클릭 이벤트를 처리할 리스너를 등록하라!
    btn.addActionListener(new MyActionListener());
    
    
    setSize(600, 480);
  }
  
  public static void main(String[] args) {
    MainApp2 f = new MainApp2();
    
    f.addWindowListener(new MyWindowListener2());
    
    f.setVisible(true);
  }
    
}








