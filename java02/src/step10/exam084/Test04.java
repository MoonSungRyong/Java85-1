/* 주제 : 이너 클래스 사용법 - 스태틱 멤버 import
 */
package step10.exam084;

// 특정 클래스의 스태틱 멤버(변수,메서드,이너클래스)의 정보를 미리 
// 컴파일러에게 알려주는 방법
//import static step10.exam084.Test02.*; // wildcard를 이용하여 모든 멤버를 가리킬 수 있다.
import static step10.exam084.Test02.A; // 특정 멤버만 가리킬 수 있다.

public class Test04 {
  public static void main(String[] args) {
    // 위에서 이미 A 클래스가 어떤 클래스의 스태틱 멤버인지 선언했기 때문에
    // 여기서는 편하게 멤버 이름만 사용하면 된다.
    A p = new A();
    p.print();
  }
}





