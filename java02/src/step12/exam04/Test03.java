/* 주제: 캡슐화 문법 - 멤버의 접근 제어
 * => private : 클래스 멤버만 접근 가능
 * => (default) : 클래스 멤버 + 같은 패키지의 클래스 
 * => protected : 클래스 멤버 + 같은 패키지의 클래스 + 자식 클래스 
 * => public : 모두 접근 가능 
 */
package step12.exam04;

public class Test03 {
  public static void main(String[] args) {
    Test03 obj = new Test03();
    
    // main()은 Test03의 멤버가 아니기 때문에 접근 불가!
    //obj.v1 = 100; // private => 컴파일 오류!
    
    // Test04 클래스가 Test03과 같은 패키지에 소속되었기 때문에 접근 가능!
    obj.v2 = 200; // (default) => OK!
    
    // Test04 클래스가 비록 Test03 클래스의 자식이 아니더라도,
    // 같은 패키지 소속이기 때문에 접근 가능!
    obj.v3 = 300; // protected => OK!
    
    // public 멤버는 어디에서든 접근 가능!
    obj.v4 = 400; // public => OK!
  }
}








