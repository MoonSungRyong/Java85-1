/* 주제: JDBC - BoardDao4 사용 : delete() */
package step13;

import java.util.Scanner;

public class Exam092_4 {

  public static void main(String[] args) {
    try {
      Scanner keyScan = new Scanner(System.in);
      System.out.print("삭제할 게시물 번호? ");
      int no = keyScan.nextInt();
      keyScan.close();
      
      BoardDao4 boardDao = new BoardDao4();
      int count = boardDao.delete(no);
      System.out.println(count);
      
      if (count > 0) {
        System.out.println("삭제 성공!");
      } else {
        System.out.println("번호에 해당하는 게시물이 없어요!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}














