package step07;

public class Board4 {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board4() {
    System.out.println("Board4() 생성자 호출됨");
    this.no = 1;
    this.title = "제목입니다";
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  public Board4(String title, String contents, String writer) {
    System.out.println("Board4(String,String,String) 생성자 호출됨");
    this.no = 1;
    this.title = title;
    this.contents = contents;
    this.writer = writer;
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  // "인스턴스 메서드"라 부른다. => 인스턴스 값을 사용하여 작업을 수행하는 메서드.
  // "연산자"라 부른다. => Board4 타입의 데이터를 다룰 수 있는 연사자로서 역할.
  // "메시지"라 부른다. => Board4 객체에 전달하는 메시지(명령어).
  public void printInfo() {
    System.out.println(this.no);
    System.out.println(this.title);
    System.out.println(this.contents);
    System.out.println(this.writer);
    System.out.println(this.createdDate);
    System.out.println(this.viewCount);
    System.out.println(this.password);
  }

}
