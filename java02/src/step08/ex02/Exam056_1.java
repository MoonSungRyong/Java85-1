/* 주제: 상속 적용 후
 * => 프로젝트: 블로그 만들기 
 * => 사용자의 이름과 이메일, 암호만 필요하다.
 */
package step08.ex02;

public class Exam056_1 {
  public static void main(String[] args) {
    User u1 = new User();
    u1.name = "홍길동";
    u1.email = "hong@test.com";
    u1.password = "1111";
  }
}

/*
 * 상속?
 * => 기존 코드를 손대지 않고 확장하는 기법
 * => 특징
 *    1) 중복 코딩을 줄인다. => 개발시간 단축 => 개발비 절감
 *    2) 검증된 코드 사용 => 시스템 안정성에 기여
 *
 * 용어 정리
 * => 상속을 해주는 클래스 : 수퍼(super)클래스, 부모(parent)클래스
 * => 송속을 받는 클래스 : 서브(sub)클래스, 자식(child)클래스 
 */







