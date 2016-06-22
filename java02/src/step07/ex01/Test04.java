/* 주제: 레퍼런스 배열 연습 - 입력 받은 데이터를 배열에 보관하기
 => 예)
제목? aaaa
내용? bbbb
암호? 1111
계속 입력하시겠습니까?(y/n) y
제목? abab
내용? cccc
암호? 2222
계속 입력하시겠습니까?(y/n) n
1, aaaa, bbbb, 1111, 2016-06-22, 0
2, abab, cccc, 2222, 2016-06-22, 0
*/
package step07.ex01;

import java.util.*;

public class Test04 {
  public static void main(String[] args) {
    //1) 키보드 스태너 준비
    Scanner keyScanner = new Scanner(System.in);

    //9) 게시물 인스턴스 주소를 여러 개 저장할 레퍼런스 배열과 인덱스 변수를 준비하라.
    Board5[] boards = new Board5[100];
    int i = 0;

    //10) 반복문에서 생성하는 변수를 반복문 밖으로 끄집어내라.
    Board5 board;
    String answer;

    //6) 게시물 정보를 입력 받는 코드를 반복 실행한다.
    while (true) {
      //2) 게시물 정보를 담을 한 개의 인스턴스와 레퍼런스를 준비
      //Board5 board = new Board5();
      board = new Board5();

      //3) 제목을 입력 받아 인스턴스 변수 "title"에 저장
      System.out.print("제목? ");
      board.title = keyScanner.nextLine();

      //4) 내용을 입력 받아 인스턴스 변수 "contents"에 저장
      System.out.print("내용? ");
      board.contents = keyScanner.nextLine();

      //5) 암호를 입력 받아 인스턴스 변수 "password"에 저장
      System.out.print("암호? ");
      board.password = keyScanner.nextLine();

      //11) 인스턴스 주소를 레퍼런스 배열에 백업하라! 인덱스 증가한다.
      boards[i] = board;
      i++;

      //7) 계속 입력할 것인지 묻는다.
      System.out.print("계속 입력하시겠습니까?(y/n) ");
      //String answer = keyScanner.nextLine();
      answer = keyScanner.nextLine();

      //8) "n"을 입력했을 때 반복문을 나간다.
      if (answer.equals("n"))
        break;
    }

    //12) 배열에 저장된 인스턴스를 참조하여 번호,제목,내용,암호,등록일,조회수를 출력한다.
    for (int x = 0; x < i; x++) {
      System.out.printf("%d, %s, %s, %s, %s, %d\n",
        boards[x].no, boards[x].title, boards[x].contents,
        boards[x].password, boards[x].createdDate, boards[x].viewCount);
    }
  }
}

/*

*/
