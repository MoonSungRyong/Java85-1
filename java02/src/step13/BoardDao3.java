// 주제: 예외가 발생했을 때 내부에서 처리할 건 처리하고 보고도 한다.
// 왜 보고해야 하는가? 그쪽에서 알아야지 적절하게 마무리 지을 것 아닌가!
package step13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardDao3 {
  ArrayList<Board> list = new ArrayList<>();
  
  // 예외 발생하면 내부에서 처리하고 보고하지 않는다.
  public BoardDao3() throws Exception {
    File file = new File("board2.dat"); 
    
    FileInputStream in = null;
    ObjectInputStream in2 = null;
    try {
      in = new FileInputStream(file); 
      in2 = new ObjectInputStream(in); 
      Board board = null;
      while (true) {
        board = (Board)in2.readObject();
        list.add(board);
      }
    } catch (Exception e) {
      // 예외를 호출자에게 보고하여 최소한 호출자에게 처리할 기회를 주자!
      throw e;
    } finally {
      // 예외가 발생하든 아니든 처리할 건 처리하자!
      try {in2.close();} catch (Exception e) {}
      try {in.close();} catch (Exception e) {}
    }
  }
  
  //예외를 처리해야 한다. 
  void insert(Board board) throws Exception {
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
  
  //예외를 처리해야 한다. 
  int update(Board board) throws Exception {
    if (board.no >= 0 && board.no < list.size()) {
      list.set(board.no, board);
      saveToFile();
      return 1;
    }
    return 0;
  }
  
  //예외를 처리해야 한다. 
  int delete(int no) throws Exception {
    if (no >= 0 && no < list.size()) {
      list.remove(no);
      saveToFile();
      return 1;
    } 
    return 0;
  }
  
  // 예외 발생하면 내부에서 처리하고 만다.
  void saveToFile() throws Exception {
    File file = new File("boavrd2.dat");
    FileOutputStream out = null;
    ObjectOutputStream out2 = null;
    try {
      out = new FileOutputStream(file); // 기존 파일 덮어씀. 없으면 만듦.
      out2 = new ObjectOutputStream(out); 
      for (Board board : list) {
        out2.writeObject(board);
      }
    } catch (Exception e) {
      throw e;
    } finally {
      // 오류가 발생하든 안하든 반드시 실행하는 블록이다.
      try {out2.close();} catch (Exception e) {}
      try {out.close();} catch (Exception e) {}
    }
  }
}








