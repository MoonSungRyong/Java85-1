/* 주제: JDBC - BoardDao4 사용 : selectList() */
package step13;

import java.util.List;

public class Exam092_2 {

  public static void main(String[] args) {
    try {
      BoardDao4 boardDao = new BoardDao4();
      List<Board2> list = boardDao.selectList();
      
      for (Board2 board : list) {
        System.out.printf("%d, %s, %s, %d\n", 
            board.getNo(), 
            board.getTitle(),
            board.getCreatedDate(),
            board.getViewCount());
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }

}














