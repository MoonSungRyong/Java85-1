/* 주제: 상속 사용 전 - 기존 코드를 복제하여 기능 추가
 * => 프로젝트: 학원 관리 시스템
 * => 사용자 정보에 전화번호와 재직여부가 있어야 한다.
 * => 해결책?
 *    1) 기존 User 클래스를 변경
 *       => 기존 User 클래스는 블로그 시스템에 사용되고 있다.
 *       => 기존 클래스를 변경하는 것은 위험하다.
 *          잘못 변경한 코드는 기존 시스템의 오류를 유발하기 때문이다.
 *    2) 새 User 클래스를 생성
 *       => 기존 클래스를 복제하여 새 클래스를 만들기로 결정함.
 */
package step08.ex01;

public class Exam055_2 {
  public static void main(String[] args) {
    Student u1 = new Student();
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
    u1.tel = "111-1111";
    u1.working = true;
  }
}









