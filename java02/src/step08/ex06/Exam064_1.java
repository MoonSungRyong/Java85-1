/* 주제: 다형성(polymorphism) - 오버라이딩(Overriding)
 */
package step08.ex06;

public class Exam064_1 {
  public static void main(String[] args) {
    B r = new B();
    // A로부터 상속받은 메서드
    r.m1();
    r.m2(); // 실행결과? 재정의한 B의 m2() 메서드가 호출되었다.
    
    // B의 메서드
    r.m3();
  }
}

/* 오버라이딩?
 * => 상속받은 메서드를 "현재 클래스의 역할에 맞게" 재정의하는 것.
 * 
 */









