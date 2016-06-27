/* 주제: 게시판+연락처 - 6단계: CRUD 명령 처리
=> 실행 예)
메인> 1
메인/공지 게시판> list
번호, 제목, 작성자, 등록일, 조회수
1, aaaa, null, 2016-06-27, 0
2, bbbb, null, 2016-06-27, 0
메인/공지 게시판> add
제목? xxx
내용? xxxx
암호? xxxxx
저장하시겠습니까?(Y/n) Y
저장하였습니다.
메인/공지 게시판> detail
번호? 1
제목: aaaa
내용: aaaaa
작성자: null
등록일: 2016-06-27
조회수: 0
메인/공지 게시판> delete
번호? 1
정말 삭제하시겠습니까?(y/N) y
삭제하였습니다.
메인/공지 게시판> list
번호, 제목, 작성자, 등록일, 조회수
2, bbbb, null, 2016-06-27, 0
메인/공지 게시판> update
번호? 1
제목(bbbb)? xxxx
내용(bbbbb)? xyxy
변경하시겠습니까?(y/N) y
변경하였습니다.
메인/공지 게시판> list
번호, 제목, 작성자, 등록일, 조회수
2, xxxx, null, 2016-06-27, 0
메인/공지 게시판> xxx
사용할 수 없는 명령입니다.
메인/공지 게시판> main
(실행을 종료하고 메인화면으로 간다)
 
 */
package step07.ex08;

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
      System.out.println("6. 회원");
      System.out.println("7. 프로젝트");
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










