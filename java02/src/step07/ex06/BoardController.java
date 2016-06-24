/* 역할: 게시물 관리(등록/조회/변경/삭제)
 => 예)
[메인 > 게시판]
제목? aaaa
내용? bbbb
암호? 1111
계속 입력하시겠습니까?(y/n) y
[메인 > 게시판]
제목? abab
내용? cccc
암호? 2222
계속 입력하시겠습니까?(y/n) n
[메인 > 게시판]
1, aaaa, bbbb, 1111, 2016-06-22, 0
2, abab, cccc, 2222, 2016-06-22, 0
*/
package step07.ex06;

import java.util.*;

public class BoardController {
  static Scanner keyScanner;
  static Board[] boards = new Board[100];
  static int i = 0;

  public static void service() {
    Board board;

    while (true) {
      board = inputBoard();
      boards[i++] = board;
      if (!prompt())
        break;
    }

    System.out.println("[메인 > 공지 게시판]");
    for (int x = 0; x < i; x++) {
      printBoard(boards[x]);
    }
  }

  // 게시물을 출력하는 메서드
  static void printBoard(Board board) {
    //번호,제목,작성자,등록일,조회수
    System.out.printf("%d, %s, %s, %s, %d\n",
      board.no, board.title, board.writer,
      board.createdDate, board.viewCount);
  }

  // 사용자에게 예/아니오를 묻는 메서드
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n"))
      return false;
    return true;
  }

  // 게시물을 입력받아 인스턴스를 생성하는 메서드
  static Board inputBoard() {
    System.out.println("[메인 > 공지 게시판]");
    
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    return board;
  }
}

/*

*/
