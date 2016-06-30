/* 주제: 다형성(polymorphism) - 오버라이딩(Overriding)
 */
package step08.ex06;

public class Exam064_2 {
  public static void main(String[] args) {
    C r1 = new C();
    r1.m1(); // A가 아닌 C에서 재정의한 메서드를 호출한다.
    r1.m2(); // B가 아닌 C에서 재정의한 메서드를 호출한다.
    r1.m4();
  }
}










