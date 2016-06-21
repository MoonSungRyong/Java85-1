// 주제: 데이터 타입 정의 - 도서 정보 다루기
// => 도서 데이터를 저장할 타입 : Book
// => 다룰 데이터: 제목, 저자, 출판사, 출판일, 국내서여부, 페이지수
package step05.ex03;

public class Test02 {
  public static void main(String[] args) {
    Book b1 = new Book();
    b1.title = "자바프로그래밍";
    b1.author = "홍길동";
    b1.press = "비트출판사";
    b1.releaseDate = "2016-08-08";
    b1.isLocal = true;
    b1.page = 521;

    Book b2 = new Book();
    b2.title = "C프로그래밍";
    b2.author = "임꺽정";
    b2.press = "비트출판사";
    b2.releaseDate = "2016-08-09";
    b2.isLocal = true;
    b2.page = 300;
  }
}

/*
*/
