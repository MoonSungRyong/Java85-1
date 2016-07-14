package step11.ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
  ArrayList<Board> list = new ArrayList<>();
  
  public BoardDao() {
    //1) 파일이 없으면 만든다. 기준 디렉토리는 실행하는 디렉토리. 즉 프로젝트 폴더.
    File file = new File("board.dat"); // 게시물 데이터를 저장할 파일 정보
    if (!(file.exists() && file.isFile())) {
      return;
    }
    try (
      // board.dat 파일을 바이트 단위로 읽는 도구.
      FileInputStream in = new FileInputStream(file); 
      // 바이트 데이터를 객체로 만들어 리턴하는 도구.
      ObjectInputStream in2 = new ObjectInputStream(in); 
    ) {
      //2) 파일이 있으면 해당 파일에서 데이터를 읽어 ArrayList에 저장한다.
      Board board = null;
      while (true) {
        board = (Board)in2.readObject();
        list.add(board);
      }
    } catch (Exception e) {
      // 파일을 읽다가 오류가 발생했다. 그럼 JVM을 멈춰야 하나?
      // => No! 적절히 오류를 처리한 다음 계속 실행하게 하자!
      // => 이것이 예외 처리 문법이 존재하는 이유이다.
      //e.printStackTrace(); // 파일로 출력할 때 기존 파일을 덮어쓰기 때문에 읽기 오류는 신경쓰지 말라!
    }
  }
  
  void insert(Board board) {
    list.add(board);
    saveToFile();
  }
  
  List<Board> selectList() {
    return list;
  }
  
  Board selectOne(int no) {
    if (no >= 0 && no < list.size()) {
      return list.get(no);
    } 
    return null;
  }
  
  int update(Board board) {
    if (board.no >= 0 && board.no < list.size()) {
      list.set(board.no, board);
      saveToFile();
      return 1;
    }
    return 0;
  }
  
  int delete(int no) {
    if (no >= 0 && no < list.size()) {
      list.remove(no);
      saveToFile();
      return 1;
    } 
    return 0;
  }
  
  void saveToFile() {
    File file = new File("board.dat");
    try (
      // 바이트 배열을 파일로 출력할 때 사용하는 도구
      FileOutputStream out = new FileOutputStream(file); // 기존 파일 덮어씀. 없으면 만듦.
      // 객체를 바이트 배열로 바꿔 out을 이용하여 파일로 저장
      ObjectOutputStream out2 = new ObjectOutputStream(out); ) { 
      
      for (Board board : list) {
        out2.writeObject(board);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}








