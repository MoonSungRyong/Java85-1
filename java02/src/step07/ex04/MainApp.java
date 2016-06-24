/* 주제: 게시판+연락처 - 2단계, 게시판 업무를 처리하는 클래스 도입하기
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ---------------------------------------
 * 메뉴 번호를 입력하세요> 1
 * [메인 > 게시판]
 * 제목? aaaa
 * 내용? bbbb
 * 암호? 1111
 * 계속 입력하시겠습니까?(y/N) n
 * 1, aaaa, null, 2016-06-24, 0
 */
package step07.ex04;

import java.util.Scanner;

public class MainApp {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);

    label1:
    while (true) {
      System.out.println("------------------------------");
      System.out.println("[메뉴]");
      System.out.println("1. 게시판");
      System.out.println("2. 연락처");
      System.out.println("0. 종료");
      System.out.println("------------------------------");
      System.out.print("메뉴 번호를 입력하세요> ");
      String menuNo = keyScanner.nextLine();

      switch (menuNo) {
      case "1":
        BoardController.main(null);
        break;
      case "2":
        System.out.println("연락처");
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










