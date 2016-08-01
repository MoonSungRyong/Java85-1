package step14.ex08.server;

import java.util.List;

import step14.ex08.vo.Board;

public interface BoardDao {
  int insert(Board board) throws Exception;
  List<Board> selectList() throws Exception;
  Board selectOne(int no) throws Exception;
  Board selectOne(int no, String password) throws Exception;
  int update(Board board) throws Exception;
  int delete(int no) throws Exception;
}








