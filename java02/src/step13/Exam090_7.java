/* 주제: 예외 처리 - 예2*/
package step13;

import java.util.List;

public class Exam090_7 {

  public static void main(String[] args) {
    try {
      // BoardDao를 통해
      BoardDao2 boardDao = new BoardDao2();
      
      // 게시물을 추가할 수 있었다. 비록 생성자에서 오류가 발생하더라도.
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      
      // 그리고 파일에 저장한다. 설사 저장하는 동안 오류가 발생하더라도 다음 명령은 실행한다.
      boardDao.saveToFile();
      
      // 작업을 수행한 후 그 내용을 확인할 수 있었다.
      List<Board> list = boardDao.selectList();
      for (Board b : list) {
        System.out.println(b);
      }
    } catch (Exception e) {
      //그런데 만약 BoardDao 생성자에게 예외가 발생한다면,
      //그 모든 일을 멈출 수 밖에 없었다.
      //=> 사실 BoardDao 생성자가 하는 일은 그냥 기존 데이터를 읽어 들이는 일이었다.
      //   설사 못 읽어 들였더라도 게시물을 추가하고 저장하는데는 문제가 없는데,
      //   그럼에도 불구하고 생성자에게 오류가 발생했다는 사실 만으로 
      //   프로그램을 멈춰야 하는다는 것이 너무 슬프다!
      System.out.println("예외가 발생했습니다.\n더 이상 할 일이 없네요.\n그냥 멈추겠습니다.");
    }
  }
}  







