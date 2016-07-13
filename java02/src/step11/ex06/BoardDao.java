package step11.ex06;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
  ArrayList<Board> list = new ArrayList<>();
  
  void insert(Board board) {
    list.add(board);
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
      return 1;
    }
    return 0;
  }
  
  int delete(int no) {
    if (no >= 0 && no < list.size()) {
      list.remove(no);
      return 1;
    } 
    return 0;
  }
}








