package step13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao4 {
  public int insert(Board2 board) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111"); 
      stmt = con.prepareStatement(
          "insert into boards(title,conts,cre_dt) values(?,?,now())");
      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContents());
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public List<Board2> selectList() throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111");  
      stmt = con.prepareStatement("select no,title,cre_dt,vw_cnt from boards");
      rs = stmt.executeQuery();
      
      ArrayList<Board2> boards = new ArrayList<>();
      Board2 board;
      while (rs.next()) {
        board = new Board2();
        board.setNo(rs.getInt("no"));
        board.setTitle(rs.getString("title"));
        board.setCreatedDate(rs.getDate("cre_dt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        boards.add(board);
      }
      return boards;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public Board2 selectOne(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111");  
      stmt = con.prepareStatement(
          "select no,title,conts,cre_dt,vw_cnt from boards where no=?");
      stmt.setInt(1, no);
      rs = stmt.executeQuery();
      
      if (rs.next()) {
        Board2 board = new Board2();
        board.setNo(rs.getInt("no"));
        board.setTitle(rs.getString("title"));
        board.setCreatedDate(rs.getDate("cre_dt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        return board;
      }
      return null;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public int update(Board2 board) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111");  
      stmt = con.prepareStatement("update boards set title=?, conts=? where no=?");
      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContents());
      stmt.setInt(3, board.getNo());
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java85db", "java85", "1111");  
      stmt = con.prepareStatement("delete from boards where no=?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }
  
}






