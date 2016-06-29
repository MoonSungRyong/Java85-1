/* 주제: 초기화 블록 - 인스턴스 블록과 생성자의 실행 순서
 * => 인스턴스를 만들 때 마다 인스턴스 블록은 선언된 순서대로 실행한다.
 * => 모든 인스턴스 블록이 실행된 후 마지막으로 생성자가 호출된다. 
 * => 인스턴스 블록의 존재 이유?
 *    - 모든 생성자가 실행해야 할 공통 작업을 수행. 
 */
package step08.ex05;

public class Exam061_3 {
  public static void main(String[] args) {
    new SUV();  
  }
}









