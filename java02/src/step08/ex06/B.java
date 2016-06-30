package step08.ex06;

public class B extends A {
  // 상속 받은 m3() 메서드를 재정의하기 => "오버라이딩"
  public void m3() {
    System.out.println("B의 m3() 호출...");
  }
 
  // 상속 받은 m2() 메서드를 재정의하기 => "오버라이딩(Overriding)"
  public void m2() {
    System.out.println("우헤헤헤");
  }
}
