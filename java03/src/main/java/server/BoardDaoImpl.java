package server;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vo.Board;

@Component("boardDao")
public class BoardDaoImpl implements BoardDao {
  @Autowired SqlSessionFactory sqlSessionFactory;
  
  public int insert(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.insert("BoardDao.insert", board);
      sqlSession.commit();
      return count;
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public List<Board> selectList(int pageNo, int length) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      HashMap<String,Object> params = new HashMap<>();
      params.put("startIndex", (pageNo - 1) * length);
      params.put("length", length);
      
      return sqlSession.selectList("BoardDao.selectList", params);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public Board selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.selectOne("BoardDao.selectOne", no);
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
      
      return sqlSession.selectOne("BoardDao.selectOneByPassword", map);
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public int update(Board board) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.update("BoardDao.update", board);
      sqlSession.commit();
      return count;
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.update("BoardDao.delete", no);
      sqlSession.commit();
      return count;
    } finally {
      try {sqlSession.close();} catch (Exception e) {}
    }
  }
  
}








