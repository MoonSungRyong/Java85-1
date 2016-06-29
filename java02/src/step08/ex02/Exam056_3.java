/* 주제: 상속 적용 후 - 인스턴스 변수 상속
 * => 프로젝트: 헬스클럽 관리 시스템
 * => 사용자 정보에 전화번호와 키, 몸무게, 가입일을 추가해야 한다.
 * => 상속 문법 적용
 *    => 기존에 작성된 User 클래스의 코드를 그대로 상속받아 코드를 추가한다.
 */
package step08.ex02;

public class Exam056_3 {
  public static void main(String[] args) {
    Member u1 = new Member();
    // name, email, password는 Member가 User로부터 상속받아 만든 변수이다.
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    
    // Member에서 새로 추가한 인스턴스 변수 
    u1.tel = "111-1111";
    u1.weight = 95;
    u1.height = 178;
    u1.regDate = "2016-06-29";
    
  }
}









