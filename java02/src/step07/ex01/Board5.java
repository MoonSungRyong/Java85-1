package step07.ex01;

public class Board5 {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  public Board5() {
    System.out.println("Board5() 생성자 호출됨");
    this.no = 1;
    this.title = "제목입니다";
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.createdDate = str;
    this.viewCount = 0;
    this.password = "1111";
  }

  public Board5(String title, String contents, String writer) {
    // 다른 생성자를 호출할 때
    // => this(파라미터, ...);
    // => 반드시 첫 번째 문장으로 와야 한다.
    this(); // 기본 생성자를 호출하여 기본 작업을 수행한다.

    // 그리고 다음 추가 작업을 수행한다.
    System.out.println("Board5(String,String,String) 생성자 호출됨");
    this.title = title;
    this.contents = contents;
    this.writer = writer;

    // 다른 생성자를 호출하는 코드는 반드시 첫 번째 문장으로 와야 한다.
    //this(); // 컴파일 오류!
  }

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
