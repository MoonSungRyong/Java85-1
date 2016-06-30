/* 주제: 다형성(polymorphism) - 오버로딩(Overloading) 적용 전
 * 오버로딩?
 * => 같은 기능을 수행하는 메서드에 대해 같은 이름을 부여함으로써
 *    프로그래밍의 일관성을 유지하게 하는 문법
 */
package step08.ex06;

public class Exam065_1 {
  public static void main(String[] args) {
    Calc c = new Calc();
    c.plus(10);
    c.plus(20);
    System.out.println(c.result);
    
    // 새로운 요구사항: 
    // 1) 배열의 값을 더하는 기능이 필요!
    // 2) 두 개의 정수 값을 더하는 기능이 필요!
    
    int[] values = {10, 20, 30, 40};
    Calc2 c2 = new Calc2();
    
    // 만약 자바가 오버로딩을 지원하지 않는다면, 
    // 같은 기능을 수행하는 메서드에 대해서 다음과 같이 다른 이름을 사용해야 한다.
    // => 개발자가 더하기 기능을 사용하기 위해 종류 별 여러 개의 메서드를 암기해야 한다.
    // => 프로그래밍의 일관성이 결여된다. => 유지보수를 힘들게 한다.
    c2.plusArray(values);
    c2.plus(150);
    c2.plusTwin(50, 80);
    
    System.out.println(c2.result);
    
  }
}










