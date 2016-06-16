// 역할: 계산과 관련된 메서드를 관리하기 좋게 모아두는 역할뿐만 아니라
//       계산 결과도 보관하는 역할을 수행한다.
package step05.ex01;

public class Calc2 {
  static int result; // static 변수나 instance 변수는 0으로 자동 초기화된다.
                     // 메서드에 선언하는 local 변수는 자동으로 초기화되지 않는다.
                     // static 변수는 JVM이 해당 클래스를 사용하는 순간
                     // 자동으로 준비된다.
                     // => 따로 준비하는 명령을 실행할 필요가 없다.
                     // 소멸? JVM이 멈출 때!
  static void plus(int a) {
    Calc2.result += a;
  }

  static void minus(int a) {
    result -= a; // 같은 클래스에 소속된 static 변수를 사용할 때는
                       // 클래스 이름을 생략할 수 있다.
  }
}
