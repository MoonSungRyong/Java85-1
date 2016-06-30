/* 주제: 상속 - 클래스를 로딩하는 또 다른 경우
 * => 스태틱 변수나 스태틱 메서드를 사용할 때.
 */
package step08.ex04;

public class Exam059_5 {
  public static void main(String[] args) throws Exception {
    User user; // 레퍼런스 변수를 선언할 때는 클래스가 로딩되지 않는다.
    
    //1) 스태틱 변수를 사용할 때 클래스가 자동 로딩된다.
    //User.count = 100;
    
    //2) 스태틱 메서드를 호출할 때 클래스가 자동 로딩된다.
    //User.increaseCount();
    
    //3) 인스턴스를 생성할 때
    //user = new User();
    
    //4) 클래스를 로딩시키는 전문 도구를 사용할 때.
    Class c = Class.forName("step08.ex04.User"); // 주어진 이름의 클래스 파일을 찾아 로딩한다.
    //user = (User)c.newInstance(); // 설계를 통해 인스턴스를 생성할 수 있다.
    
  }
}









