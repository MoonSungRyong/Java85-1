/* 주제: 예외 처리 - 예1*/
package step13;

import java.util.List;

public class Exam090_6 {

  public static void main(String[] args) {
    try {
      // BoardDao를 통해
      BoardDao boardDao = new BoardDao();
      
      // 게시물을 추가하고,
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      boardDao.insert(new Board("aaaa", "bbb", "1111"));
      
      // 그리고 파일에 저장하고 싶었다.
      boardDao.saveToFile();
      
      // 생성자에서 오류가 발생하면 여기까지 오지도 못한다. T.T
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







