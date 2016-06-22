/* 주제: 인스턴스 활용 - 배열을 활용하여 여러 개의 데이터를 객체에 담기
 => 예)
> java -cp bin Exam053
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
package step07;

import java.util.*;

public class Exam053_1 {
  public static void main(String[] args) {
    // v01 = 한 개의 게시물 데이터 입력 받기
    Scanner keyScanner = new Scanner(System.in);

    Board5 board = new Board5();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();

    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    System.out.println(answer);
  }
}

/*

*/
