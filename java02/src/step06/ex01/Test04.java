// 주제: 데이터 타입 정의 - 게시물 정보 다루기
// => 주문 데이터를 저장할 타입 : Board
// => 다룰 데이터: 번호, 제목, 내용, 작성자, 작성일, 조회수
package step06.ex01;

public class Test04 {
  public static void main(String[] args) {
    Board b1;
    b1 = new Board();
    b1.no = 1;
    b1.title = "제목입니다..";
    b1.contents = "내용입니다.";
    b1.writer = "hong11";
    b1.createdDate = "2016-06-20";
    b1.viewCount = 0;

  }
}

/*
*/
