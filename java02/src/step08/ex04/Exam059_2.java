/* 주제: 상속 - 클래스 로딩 조건 */
package step08.ex04;

public class Exam059_2 {
  public static void main(String[] args) {
    User user;
    
    // 인스턴스를 생성할 때 클래스가 로딩되어 있어야 한다. 
    // => 클래스를 로딩한다.
    // => User.class를 제거하고 실행하면 실행 오류 발생!
    //    인스턴스를 생성할 때 로딩된 클래스가 있어야 함을 증명한다.
    // => 클래스가 로딩되면 static 블록이 실행됨을 알 수 있다.
    user = new User();
  }
}









