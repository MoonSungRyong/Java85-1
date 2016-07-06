/* 주제: OOP 문법 활용 - 배치관리자에게 버튼의 위치를 알려준다.
 * 학습목표
 * - 기존 코드를 재활용하기 위한 방법으로 상속 문법을 이용했다.
 *   => 기존의 Frame을 버튼을 두 개 가진 프레임으로 확장했다.
 * - 여러 역할자가 협업하여 작업을 수행한다는 개념 => 객체들이 서로 연계하여 작업을 수행.
 *   => 객체지향 프로그래밍의 전형적인 특징!
 */
package step10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Exam076 extends Frame {
  public Exam076() {
    super("Hello");
    
    Button yesBtn = new Button("Yes");
    Button noBtn = new Button("No");
    
    // 상속 받은 메서드나 자신의 메서드를 호출할 때는 this를 생략할 수 있다.
    // 배치 관리자에게 위치를 알려주자!
    add(yesBtn, BorderLayout.NORTH);
    add(noBtn, BorderLayout.CENTER);
    
    setSize(400, 300); 
  }

  
  public static void main(String[] args) {
    Exam076 f = new Exam076();
    f.setVisible(true);
  }

}







