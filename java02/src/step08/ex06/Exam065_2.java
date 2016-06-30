/* 주제: 다형성(polymorphism) - 오버로딩(Overloading) 적용 후
 * 오버로딩?
 * => 파라미터의 종류나 파라미터의 개수가 다르더라도,
 *    같은 기능을 수행하는 메서드에 대해 같은 이름을 부여함으로써
 *    프로그래밍의 일관성을 유지하게 하는 문법
 */
package step08.ex06;

public class Exam065_2 {
  public static void main(String[] args) {
    int[] values = {10, 20, 30, 40};
    Calc3 c3 = new Calc3();
    
    // 파라미터의 종류와 개수에 따라 호출할 메서드를 자동으로 결정한다.
    c3.plus(values); 
    c3.plus(150);
    c3.plus(50, 80);
    
    System.out.println(c3.result);
    
  }
}










