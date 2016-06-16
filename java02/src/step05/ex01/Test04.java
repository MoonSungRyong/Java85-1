// 연습: 4단계 - instance 변수 적용
// => 동시에 여러 개의 계산을 수행하고, 그 결과를 개별적으로 따로따로 관리하고 싶다.
// => 문제는 static 변수는 오직 클래스당 한 개만 존재한다.
//    계산 결과를 동시에 여러 개 유지할 수 없다.

package step05.ex01;

public class Test04 {
  public static void main(String[] args) {
    // 계산A: 3 - 5 + 7 + 2 = ?
    // 계산B: 7 + 3 - 2 - 1 = ?

    // Calc2 클래스를 사용하면,
    // 위의 두 개의 식을 동시에 계산할 수 없다.
    // 다음과 같이 순차적으로 계산을 수행해야 한다.
    Calc2.plus(3);
    Calc2.minus(5);
    Calc2.plus(7);
    Calc2.plus(2);
    System.out.println(Calc2.result);

    // 새로운 계산을 시작하기 전에 기존 계산 결과를 0으로 초기화시키야 한다.
    Calc2.result = 0;
    Calc2.plus(7);
    Calc2.plus(3);
    Calc2.minus(2);
    Calc2.minus(1);
    System.out.println(Calc2.result);
  }
}
