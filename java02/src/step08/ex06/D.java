package step08.ex06;

public class D extends C {
  // 상속 받은 메서드를 재정의한다. => 오버라이딩
  public void m3() {
    // 기존 기능을 완전히 재정의하는 것이 아니라,
    // 기존 기능에 명령어를 추가하는 방법
    super.m3(); // 재정의하기 전에 기능을 수행한다.
    
    //그리고 새 명령을 추가한다.
    System.out.println("D의 m3() 호출...");
  }
}
