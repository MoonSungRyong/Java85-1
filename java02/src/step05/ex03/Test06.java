// 주제: 데이터 타입 정의 - 연락처 정보 다루기
// => 주문 데이터를 저장할 타입 : Contact
// => 다룰 데이터: 이름, 성, 직위, 회사, 홈페이지, 팩스, 전화번호, 이메일
package step05.ex03;

public class Test06 {
  public static void main(String[] args) {
    Contact c1 = new Contact();
    c1.firstName = "길동";
    c1.lastName = "홍";
    c1.position = "대리";
    c1.company = "비트컴퓨터";
    c1.homepage = "www.bitcamp.co.kr";
    c1.fax = "02-123-1234";
    c1.tel = "010-1234-5678";
    c1.email = "hong@test.com";
    //c1.test = 20;  // 존재하지 않는 인스턴스 변수를 가리키면 컴파일 오류 발생!
  }
}

/*
*/
