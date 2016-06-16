// 역할: 계산과 관련된 메서드를 관리하기 좋게 모아두는 역할뿐만 아니라
//       계산 결과도 보관하는 역할을 수행한다.
//       계산 결과는 개별적으로 관리할 수 있도록 인스턴스 변수로 선언한다.
package step05.ex01;

public class Calc3 {
  int result; // new 명령을 이용하여 준비시킨다.
              // new 명령을 실행할 때 마다 개별적으로 메모리가 준비된다.
              // instance 변수도 static 변수처럼 0으로 자동 초기화된다.
              // 강조! 메서드의 local 변수는 자동으로 초기화되지 않는다.
  static void plus(Calc3 instanceAddress, int a) {
    instanceAddress.result += a;
  }

  static void minus(Calc3 instanceAddress, int a) {
    instanceAddress.result -= a;
  }
}
