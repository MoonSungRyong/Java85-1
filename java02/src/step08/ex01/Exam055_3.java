/* 주제: 상속 - 인스턴스 변수의 상속
 * => 프로젝트: 헬스클럽 관리 시스템
 * => 사용자 정보에 전화번호와 키, 몸무게, 가입일을 추가해야 한다.
 * => 해결책?
 *    기존 User 클래스를 복제하여 새 클래스를 만들기로 결정함.
 */
package step08.ex01;

public class Exam055_3 {
  public static void main(String[] args) {
    Member u1 = new Member();
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    u1.tel = "111-1111";
    u1.weight = 95;
    u1.height = 178;
    u1.regDate = "2016-06-29";
  }
}









