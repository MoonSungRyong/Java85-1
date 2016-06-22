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

public class Test03 {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);

    // Board5 인스턴스의 주소를 100개 저장할 메모리 준비
    // => new Board5[100] : 인스턴스 주소를 담을 레퍼런스를 100개 준비하라는 명령어이다.
    // => Board5[] boards : 배열의 주소를 담을 변수를 준비하라는 명령어이다.
    Board5[] boards = new Board5[100]; // 레퍼런스 변수(Board board;) * 100개
    //Board5[] boards2 = new Board5(); // 컴파일 오류! 배열의 주소가 아니다!

    // 배열 방번호
    int i = 0;

    Board5 board; // 반복문 안에서 사용할 변수를 밖에 둔다.
    //Board5 board2 = new Board5[100]; // 컴파일 오류! 인스턴스 주소가 아니다!
    //Board5 board3 = new String("okok"); // 컴파일 오류! Board5 인스턴스의 주소가 아니다!
    while (i < 100) {
      board = new Board5();
      System.out.print("제목? ");
      board.title = keyScanner.nextLine();
      System.out.print("내용? ");
      board.contents = keyScanner.nextLine();
      System.out.print("암호? ");
      board.password = keyScanner.nextLine();

      // 인스턴스 주소를 레퍼런스 배열에 저장한다.
      boards[i] = board;
      i++; // 다음 방 번호로 이동

      System.out.print("계속 입력하시겠습니까?(y/n) ");
      String answer = keyScanner.nextLine();
      if (answer.equals("n"))
        break;
    }
  }
}

/*

*/
