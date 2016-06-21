// 주제: 생성자 - 데이터 타입 정의
// => 게시물 데이터를 저장할 데이터 타입을 정의
package step07;

public class Exam042 {
  public static void main(String[] args) {
    Board b1 = new Board();
    b1.no = 1;
    b1.title = "제목입니다.";
    b1.contents = "내용입니다.";
    b1.writer = "홍길동";
    b1.createdDate = "2016-06-21";
    b1.viewCount = 0;
    b1.password = "1111";
  }
}

/*
*/
