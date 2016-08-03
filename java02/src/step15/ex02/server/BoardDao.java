package step15.ex02.server;

import java.util.List;

import step15.ex02.vo.Board;

public interface BoardDao {
  int insert(Board board) throws Exception;
  List<Board> selectList(int pageNo, int length) throws Exception;
  Board selectOne(int no) throws Exception;
  Board selectOne(int no, String password) throws Exception;
  int update(Board board) throws Exception;
  int delete(int no) throws Exception;
}








