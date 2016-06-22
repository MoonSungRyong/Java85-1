// 주제: 기타 - 사용자 입력과 객체 생성
package step07;

import java.util.*;

public class Exam052 {
  public static void main(String[] args) {
    //1) 사용자 입력을 저장할 메모리를 준비: Board 인스턴스 생성
    Board5 board = new Board5(); // 생성자를 통해 인스턴스 변수들이 적절한 값으로
                                 // 초기화 될 것이다.

    //2) 사용자가 입력한 내용을 준비한 메모리에 저장: Board 인스턴스 변수에 저장
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();

    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();

    System.out.print("암호? ");
    board.password = keyScanner.nextLine();

    board.printInfo();
  }
}

/*

*/
