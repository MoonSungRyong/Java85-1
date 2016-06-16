// 연습: 2단계 - 클래스 적용 후
// => 계산에 관련된 메서드를 별도의 클래스로 분리함으로써
//    다른 프로그램에서 재사용 하기가 쉽다.
package step05.ex01;

public class Test02 {
  public static void main(String[] args) {
    // 계산: 3 - 5 + 7 + 2 = ?
    int result = Calc.minus(3, 5);
    result = Calc.plus(result, 7);
    result = Calc.plus(result, 2);
    System.out.println(result);
  }
}
