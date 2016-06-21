package step07;

public class Board6 {
  int no;
  String title;
  String contents;
  String writer;
  String createdDate;
  int viewCount;
  String password;

  // 생성자가 단 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.

  public Board6(String title, String contents, String writer) {
    //this(); // 기본 생성자가 없기 때문에 컴파일 오류!

    // 그리고 다음 추가 작업을 수행한다.
    System.out.println("Board5(String,String,String) 생성자 호출됨");
    this.title = title;
    this.contents = contents;
    this.writer = writer;
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
