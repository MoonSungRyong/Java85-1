/* 주제: JDBC - BoardDao4 사용: update() */
package step13;

import java.util.Scanner;

public class Exam092_3 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    try {
      Board2 board = new Board2();
      System.out.print("번호? ");
      board.setNo(Integer.parseInt(keyScan.nextLine()));
      System.out.print("제목? ");
      board.setTitle(keyScan.nextLine());
      System.out.print("내용? ");
      board.setContents(keyScan.nextLine());
      
      BoardDao4 boardDao = new BoardDao4();
      int count = boardDao.update(board);
      
      System.out.println(count);
      if (count > 0) {
        System.out.println("변경 성공!");
      } else {
        System.out.println("번호에 해당하는 게시물이 없어요!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
    keyScan.close();
  }

}














