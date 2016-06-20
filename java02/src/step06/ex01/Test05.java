// 주제: 데이터 타입 정의 - 회원 정보 다루기
// => 주문 데이터를 저장할 타입 : User
// => 다룰 데이터: 아이디, 비밀번호, 이름, 우편번호, 기본주소, 상세주소, 전화번호, 이메일
package step06.ex01;

public class Test05 {
  public static void main(String[] args) {
    User u1 = new User();
    u1.id = "hong11";
    u1.password = "1111";
    u1.name = "홍길동";
    u1.postNo = "17912";
    u1.basicAddress = "서울시 서초구";
    u1.detailAddress = "비트82길 17";
    u1.tel = "010-1234-5678";
    u1.email = "hong11@test.com";
  }
}

/*
*/
