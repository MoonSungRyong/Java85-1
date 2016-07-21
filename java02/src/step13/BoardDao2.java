// 주제: 예외가 발생했을 때 내부에서 처리하기
package step13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardDao2 {
  ArrayList<Board> list = new ArrayList<>();
  
  // 예외 발생하면 내부에서 처리하고 보고하지 않는다.
  public BoardDao2() {
    File file = new File("board2.dat"); 
    
    try {
      FileInputStream in = new FileInputStream(file); 
      ObjectInputStream in2 = new ObjectInputStream(in); 
      Board board = null;
      while (true) {
        board = (Board)in2.readObject();
        list.add(board);
      }
    } catch (Exception e) {
      System.out.println("우아~~~~ 큰 일 났어요. 파일을 읽다고 오류가 발생했어요!!!");
    }
  }
  
  //예외가 발생해도 모른다.
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
  
  //예외가 발생해도 모른다.
  int update(Board board) {
    if (board.no >= 0 && board.no < list.size()) {
      list.set(board.no, board);
      saveToFile();
      return 1;
    }
    return 0;
  }
  
  //예외가 발생해도 모른다. 
  int delete(int no) {
    if (no >= 0 && no < list.size()) {
      list.remove(no);
      saveToFile();
      return 1;
    } 
    return 0;
  }
  
  // 예외 발생하면 내부에서 처리하고 만다.
  void saveToFile() {
    File file = new File("board2.dat");
    try {
      FileOutputStream out = new FileOutputStream(file); // 기존 파일 덮어씀. 없으면 만듦.
      ObjectOutputStream out2 = new ObjectOutputStream(out); 
      for (Board board : list) {
        out2.writeObject(board);
      }
    } catch (Exception e) {
      System.out.println("우아~~~ 저장하다가 오류가 발생했어요...");
    }
  }
}








