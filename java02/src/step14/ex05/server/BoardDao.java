package step14.ex05.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
  Connection con;
  
  public void setConnection(Connection con) {
    this.con = con;
  }

  public int insert(Board board) throws Exception {
    PreparedStatement stmt = null;
    
    try {
      stmt = con.prepareStatement(
          "insert into boards(title,conts,cre_dt,password) values(?,?,now(),password(?))");
      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContents());
      stmt.setString(3, board.getPassword());
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public List<Board> selectList() throws Exception {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      stmt = con.prepareStatement("select no,title,cre_dt,vw_cnt from boards");
      rs = stmt.executeQuery();
      
      ArrayList<Board> boards = new ArrayList<>();
      Board board;
      while (rs.next()) {
        board = new Board();
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
    }
  }
  
  public Board selectOne(int no) throws Exception {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      stmt = con.prepareStatement(
          "select no,title,conts,cre_dt,vw_cnt from boards where no=?");
      stmt.setInt(1, no);
      rs = stmt.executeQuery();
      
      if (rs.next()) {
        Board board = new Board();
        board.setNo(rs.getInt("no"));
        board.setTitle(rs.getString("title"));
        board.setContents(rs.getString("conts"));
        board.setCreatedDate(rs.getDate("cre_dt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        return board;
      }
      return null;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public Board selectOne(int no, String password) throws Exception {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try {
      stmt = con.prepareStatement(
          "select no,title,conts,cre_dt,vw_cnt from boards where no=? and password=password(?)");
      stmt.setInt(1, no);
      stmt.setString(2, password);
      rs = stmt.executeQuery();
      
      if (rs.next()) {
        Board board = new Board();
        board.setNo(rs.getInt("no"));
        board.setTitle(rs.getString("title"));
        board.setContents(rs.getString("conts"));
        board.setCreatedDate(rs.getDate("cre_dt"));
        board.setViewCount(rs.getInt("vw_cnt"));
        return board;
      }
      return null;
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public int update(Board board) throws Exception {
    PreparedStatement stmt = null;
    
    try {
      stmt = con.prepareStatement("update boards set title=?, conts=? where no=?");
      stmt.setString(1, board.getTitle());
      stmt.setString(2, board.getContents());
      stmt.setInt(3, board.getNo());
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    PreparedStatement stmt = null;
    
    try {
      stmt = con.prepareStatement("delete from boards where no=?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
    }
  }
  
}








