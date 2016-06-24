/* 주제: 게시판+연락처 - 3단계, 게시판 추가하기
 * [메뉴]
 * 1. 공지 게시판
 * 2. 영업부 게시판
 * 3. 개발부 게시판
 * 4. 직원 연락처
 * 5. 고객 연락처
 * 0. 종료
 
 */
package step07.ex07;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    
    // 모든 게시판이 공통으로 사용할 키보드 스캐너는 스태틱 변수(클래스 변수)에서 관리한다.
    BoardController.keyScanner = keyScanner;
    
    // 각 게시판마다 별도로 관리할 메모리를 준비한다.
    // => 게시물 배열(boards), 배열 인덱스(i), 게시판 이름(boardName)
    BoardController board1 = new BoardController("공지 게시판");
    BoardController board2 = new BoardController("영업부 게시판");
    BoardController board3 = new BoardController("개발부 게시판");
    
    ContactController.keyScanner = keyScanner;
    
    ContactController contact1 = new ContactController("직원 연락처");
    ContactController contact2 = new ContactController("고객 연락처");
    
    label1:
    while (true) {
      System.out.println("------------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 공지 게시판");
      System.out.println("2. 영업부 게시판");
      System.out.println("3. 개발부 게시판");
      System.out.println("4. 직원 연락처");
      System.out.println("5. 고객 연락처");
      System.out.println("0. 종료");
      System.out.println("------------------------------");
      System.out.print("메뉴 번호를 입력하세요> ");
      String menuNo = keyScanner.nextLine();

      switch (menuNo) {
      case "1":
        board1.service();
        break;
      case "2":
        board2.service();
        break;
      case "3":
        board3.service();
        break;  
      case "4":
        contact1.service();
        break;
      case "5":
        contact2.service();
        break;  
      case "0":
        break label1;
      default:
        System.out.println("해당 메뉴가 없습니다.");
      }
    }
    // 프로그램이 종료되면 JVM이 사용한 모든 자원이 자동 해제된다. 
    // 다음은 선택사항이다.
    keyScanner.close(); // 스캐너를 사용한 후 꺼라! => 스캐너가 사용한 자원을 해제한다.
  }

}










