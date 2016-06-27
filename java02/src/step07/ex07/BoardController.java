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
package step07.ex07;

import java.util.*;

public class BoardController {
  // 여러 인스턴스에서 공유하는 변수는 스태틱 변수로 둔다.
  // => 게시판 마다 키보드 스태너를 따로 관리할 필요가 없기 때문이다.
  static Scanner keyScanner;
  
  // 개별적으로 관리해야 할 변수는 인스턴스 변수로 선언한다.
  Board[] boards = new Board[100];
  int i = 0;
  String boardName; // 게시판마다 이름이 달라야 하기 때문에 인스턴스 변수로 따로 관리한다.

  public BoardController() {}
  
  public BoardController(String boardName) {
    this.boardName = boardName;
  }
  
  // 인스턴스 변수의 값을 다루는 메서드는 인스턴스 메서드로 선언하는 것이 사용하기에 편하다.
  // => 인스턴스 변수를 다루기 위해 파라미터로 인스턴스 주소를 받을 필요가 없기 때문이다.
  // => 인스턴스 주소는 this에 자동 저장되기 때문이다.
  public void service() {
    while (true) {
      System.out.printf("[메인 > %s]\n", this.boardName);
      this.input();
      if (!prompt())
        break;
    }
    System.out.printf("[메인 > %s]\n", this.boardName);
    this.printAll();
  }

  void printAll() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
        this.boards[x].no, this.boards[x].title, this.boards[x].writer,
        this.boards[x].createdDate, this.boards[x].viewCount);
    }
  }

  //인스턴스 변수를 사용하지 않기 때문에 그냥 스태틱 메서드로 둔다.
  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n"))
      return false;
    return true;
  }

  void input() {
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    
    this.boards[this.i++] = board;
  }
}

/*

*/
