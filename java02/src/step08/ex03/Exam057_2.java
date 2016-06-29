/* 주제: 상속 - 인스턴스 메서드 상속
 * => 기존의 Calculator에 곱하기 기능을 추가하고 싶다.
 * => 상속을 이용하여 기능을 추가해보자! 
 */
package step08.ex03;

public class Exam057_2 {
  public static void main(String[] args) {
    Calculator2 calc = new Calculator2();
    // Calculator로부터 상속받은 메서드 호출
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    
    // Calculator2에서 추가한 메서드 호출
    calc.multiple(2);
    
    // Calculator로부터 상속받은 변수 사용 
    System.out.println(calc.result);
  }
}
