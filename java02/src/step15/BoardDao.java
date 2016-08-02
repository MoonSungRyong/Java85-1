package step15;

import java.io.InputStream;
import java.util.HashMap;
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
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.selectList("step15sql.selectList");
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public Board selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.selectOne("step15sql.selectOne", no);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public Board selectOne(int no, String password) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      HashMap<String,Object> map = new HashMap<>();
      map.put("no", no);
      map.put("password", password);
      
      return sqlSession.selectOne("step15sql.selectOneByPassword", map);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public int update(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.update("step15sql.update", board);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.update("step15sql.delete", no);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
}








