/* 역할: 게시물 관리(등록/조회/변경/삭제)*/
package step07.ex09;

import java.util.*;

public class BoardController {
  static Scanner keyScanner;
  String boardName; 

  BoardDao boardDao = new BoardDao();
  
  public BoardController() {}
  
  public BoardController(String boardName) {
    this.boardName = boardName;
  }
  
  public void service() {
    String command;
    
    label1: while (true) {
      System.out.printf("메인/%s> ", boardName);
      command = keyScanner.nextLine();
      
      switch (command) {
      case "main":
        break label1;
      case "add":
        this.add();
        break;
      case "list":
        this.list();
        break;
      case "detail":
        this.detail();
        break;
      case "update":
        this.update();
        break;
      case "delete":
        this.delete();
        break;
      default:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
  }

  void list() {
    Board[] boards = boardDao.selectList();
    for (int i = 0; i < boards.length; i++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
        i, 
        boards[i].title, 
        boards[i].writer,
        boards[i].createdDate, 
        boards[i].viewCount);
    }
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/n) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n"))
      return false;
    return true;
  }

  void add() {
    Board board = new Board();
    System.out.print("제목? ");
    board.title = keyScanner.nextLine();
    System.out.print("내용? ");
    board.contents = keyScanner.nextLine();
    System.out.print("암호? ");
    board.password = keyScanner.nextLine();
    
    boardDao.insert(board);
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Board board = boardDao.selectOne(no);
    
    if (board == null) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    
    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.contents);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.createdDate);
    System.out.printf("조회수: %s\n", board.viewCount);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Board originBoard = boardDao.selectOne(no);
    
    if (originBoard == null) {
      System.out.println("해당 게시물이 없습니다.");
      return;
    }
    
    Board newBoard = new Board();
    System.out.printf("제목(%s)? ", originBoard.title);
    newBoard.title = keyScanner.nextLine();
    System.out.printf("내용(%s)? ", originBoard.contents);
    newBoard.contents = keyScanner.nextLine();
    
    System.out.print("변경하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      newBoard.no = no;
      boardDao.update(newBoard);
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }
  
  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    System.out.print("삭제하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      int count = boardDao.delete(no);
      if (count > 0) {
        System.out.println("삭제하였습니다.");
      } else {
        System.out.println("해당 게시물이 없습니다.");
      }
    } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
  
}

/*

*/









