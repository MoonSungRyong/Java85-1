package step13.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
  void insert(Board board) {}
  
  List<Board> selectList() {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      ArrayList<Board> list = new ArrayList<>();
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db", "java85", "1111");
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from boards");
      Board board;
      while (rs.next()) {
        board = new Board();
        board.setNo(rs.getInt("no"));
        board.setTitle(rs.getString("title"));
        board.setCreatedDate(rs.getDate("cre_dt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        list.add(board);
      }
      return list;
    } catch (Exception e) {
      
    } finally {
      // 자원을 해제할 때는 의존 순으로 해제한다. 
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    return null;
  }
  
  Board selectOne(int no) {return null;}
  
  int update(Board board) {return 0;}
  
  int delete(int no) {return 0;}
}








