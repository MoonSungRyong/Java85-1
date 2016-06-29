/* 주제: 상속 - 클래스 로딩 순서
 * => 항상 수퍼 클래스부터 로딩된다.
 */
package step08.ex04;

public class Exam059_3 {
  public static void main(String[] args) {
    Student student;
    
    // 클래스를 로딩할 때 수퍼 클래스도 함께 로딩된다.
    // => Student의 수퍼클래스인 "User.class"를 제거하고 실행해보라!
    //    => 클래스 로딩 오류 발생!
    // => User 클래스가 있다면,
    //    => 수퍼 클래스부터 로딩되는 것을 알 수 있다.
    student = new Student();
  }
}









