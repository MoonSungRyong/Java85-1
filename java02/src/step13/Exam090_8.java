/* 주제: 예외 처리 - 예3*/
package step13;

import java.util.List;

public class Exam090_8 {

  public static void main(String[] args) {
    try {
      // BoardDao를 통해
      BoardDao3 boardDao = null;
      try {
        boardDao = new BoardDao3();
      } catch (Exception e) {}
      
        // 게시물을 추가할 수 있다. 예외를 보고하면 어떻게 하지?
      // 여기서 멈추나? 아니, 입력만 멈추고 계속 가자!
      try {
        boardDao.insert(new Board("aaaa", "bbb", "1111"));
        boardDao.insert(new Board("aaaa", "bbb", "1111"));
        boardDao.insert(new Board("aaaa", "bbb", "1111"));
      } catch (Exception e) {
        System.out.println("입력 오류 발생!");
      }
      
      // 그리고 파일에 저장한다. 설사 저장하는 동안 오류가 발생하더라도 다음 명령은 실행한다.
      boardDao.saveToFile();
      
      // 작업을 수행한 후 그 내용을 확인할 수 있었다.
      List<Board> list = boardDao.selectList();
      for (Board b : list) {
        System.out.println(b);
      }
    } catch (Exception e) {
      System.out.println("예외가 발생했습니다.\n더 이상 할 일이 없네요.\n그냥 멈추겠습니다.");
    }
  }
}  







