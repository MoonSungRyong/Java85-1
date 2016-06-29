/* 주제: 상속 적용 후 - 인스턴스 변수 상속
 * => 프로젝트: 학원 관리 시스템
 * => 사용자 정보에 전화번호와 재직여부가 있어야 한다.
 * => 상속 문법 적용
 *    => 기존에 작성된 User 클래스의 코드를 그대로 상속받아 코드를 추가한다.
 */
package step08.ex02;

public class Exam056_2 {
  public static void main(String[] args) {
    Student u1 = new Student();
    // name, email, password는 Student가 User로부터 상속받아 만든 변수이다.
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    
    // tel, working은 Student에서 새로 추가한 변수이다.
    u1.tel = "111-1111";
    u1.working = true;
    
  }
}









