/* 주제: 상속 - 인스턴스 메서드 상속 */
package step08.ex03;

public class Exam058_1 {
  public static void main(String[] args) {
    Calculator calc = null;
    // 인스턴스를 사용하지 않는 메서드를 호출하더라도
    // 그 메서드가 인스턴스 메서드인 경우
    // 무조건 유효한 인스턴스 주소를 넘겨야 한다.
    //calc.print(); // 인스턴스 주소가 null이다. 따라서 실행 오류!
    
    calc = new Calculator();
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    System.out.println(calc.result);
  }
}
