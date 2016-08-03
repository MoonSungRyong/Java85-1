/* 주제: Mybatis - 삭제하기 */
package step15.ex01;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDelete {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("step15/ex01/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    
    sqlSession.delete("step15sql.delete", 32);
    
    sqlSession.close();
    System.out.println("삭제 성공입니다!");
  }

}














