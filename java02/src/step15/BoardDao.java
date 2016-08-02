package step15;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDao {
  SqlSessionFactory sqlSessionFactory;
  
  public BoardDao() throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("step15/mybatis-config.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  }

  public int insert(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.insert("step15sql.insert", board);
      
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
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








