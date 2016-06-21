package step07;

public class Board3 {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board3() {
    System.out.println("Board3() 생성자 호출됨");
    // 생성자도 내장 변수 this 가 있다.
    // this는 새로 생성한 인스턴스 주소를 갖고 있다.
    this.no = 1;
    this.title = "제목입니다";

    // 오늘 날짜를 문자열로 얻는 기능
    // 1) 오늘 날짜가 들어있는 인스턴스 준비
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    // 2) toString() 연산자: 인스턴스에서 날짜 정보를 뽑아서 문자열로 바꾼다.
    String str = today.toString();
    this.createdDate = str;

    this.viewCount = 0;
    this.password = "1111";
  }

}
