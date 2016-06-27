/* 주제: 게시판+연락처 - 1단계: 메인 메뉴 기능 추가
 * ---------------------------------------
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ---------------------------------------
 * 메뉴 번호를 입력하세요> 1
 * 게시판
 * ---------------------------------------
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ---------------------------------------
 * 메뉴 번호를 입력하세요> 2
 * 연락처
 * ---------------------------------------
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ---------------------------------------
 * 메뉴 번호를 입력하세요> 3
 * 해당 메뉴가 없습니다.
 * ---------------------------------------
 * [메뉴]
 * 1. 게시판
 * 2. 연락처
 * 0. 종료
 * ---------------------------------------
 * 메뉴 번호를 입력하세요>
 */
package step07.ex03;

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
        System.out.println("게시판");
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










