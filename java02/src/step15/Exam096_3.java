/* 주제: Mybatis - 입력하기
 */
package step15;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_3 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("step15/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    
    Board board = new Board();
    board.setTitle("테스트입니다.");
    board.setContents("내용입니다....");
    board.setPassword("1111");
    
    sqlSession.insert("step15sql.insert", board);
    
    sqlSession.close();
    System.out.println("입력 성공입니다!");
  }

}














