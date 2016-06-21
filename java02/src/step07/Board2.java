package step07;

public class Board2 {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  // 기본 생성자(특별한 메서드)를 선언한다.
  // 문법도 특별해서
  // 1) 리턴 타입이 없고,
  // 2) 메서드명은 클래스 이름과 같다.
  // 3) 파라미터가 없다.
  // 인스턴스를 생성할 때 자동 호출된다.
  // 만약 생성자를 만들지 않는다면, 컴파일러가 다음과 같이 기본 생성자를 만든다.
  // public Board2() {}

  public Board2() {
    System.out.println("Board2() 생성자 호출됨");
  }

}
