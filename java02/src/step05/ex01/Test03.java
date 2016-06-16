// 연습: 3단계 - static 변수 적용
// => 클래스에 소속된 변수라고 해서 "클래스 변수"라고 부른다.
// => 메서드의 계산 결과를 클래스 내부에서 관리하는 방법.
//
package step05.ex01;

public class Test03 {
  public static void main(String[] args) {
    // 계산: 3 - 5 + 7 + 2 =
    // => Calc2의 메서드들이 작업한 결과를 그 클래스에서 관리하게 함으로써
    //    그 메서드를 사용하는 개발자는 결과를 따로 관리할 필요가 없다.
    Calc2.plus(3);
    Calc2.minus(5);
    Calc2.plus(7);
    Calc2.plus(2);
    System.out.println(Calc2.result);
  }
}
