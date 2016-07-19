package step12.exam04;

public class Y extends step12.exam03.C {
  public void m2() {
    // 상속 받은 변수라도 private 접근자는 오직 그 클래스의 멤버만이 접근 가능하다.
    //this.v1 = 300; // private => 컴파일 오류!
    
    // m()은 C의 멤버이기 때문에, m()에서 v1에 접근하는 것은 가능하다!
    m(); // OK!
    
    // (default) 접근 제어는 오직 같은 패키지 멤버만 접근 가능하다.
    //this.v2 = 300; // (default) => 컴파일 오류!
    
    // protected 접근 제어는 자식 클래스가 접근 가능하다.
    this.v3 = 300; // protected => OK!
    
    // public 접근 제어는 모두 접근 가능!
    this.v4 = 300; // public => OK!
  }
}
