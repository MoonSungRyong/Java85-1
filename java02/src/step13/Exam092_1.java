/* 주제: JDBC - BoardDao4 사용: insert()
 *     
 *    
 */
package step13;

import java.util.Scanner;

public class Exam092_1 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    try {
      Board2 board = new Board2();
      System.out.print("제목? ");
      board.setTitle(keyScan.nextLine());
      System.out.print("내용? ");
      board.setContents(keyScan.nextLine());
      
      BoardDao4 boardDao = new BoardDao4();
      int count = boardDao.insert(board);
      
      if (count > 0) 
        System.out.println("입력 성공!");
      else
        System.out.println("입력 실패!");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } 
    keyScan.close();
  }

}














