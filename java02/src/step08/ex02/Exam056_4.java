/* 주제: 상속 적용 후 - 인스턴스 변수 상속
 * => 프로젝트: IT교육센터 관리 시스템
 * => 사용자 정보에 전화, 재직여부, 회사, 직위 정보를 추가해야 한다.
 * => 상속 문법 적용
 *    => 기존에 작성된 User 클래스의 코드를 그대로 상속받아 코드를 추가한다.
 */
package step08.ex02;

public class Exam056_4 {
  public static void main(String[] args) {
    Student2 u1 = new Student2();
    // name, email, password는 User로부터 상속받아 만든 변수이다.
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    
    // Student에서 추가한 변수 
    u1.tel = "111-1111";
    u1.working = true;
    
    // Student2가 추가한 변수
    u1.company = "오호라주식회사";
    u1.position = "대리";
    
  }
}









