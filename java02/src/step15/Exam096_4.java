/* 주제: Mybatis - selectOne() 사용법 */
package step15;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_4 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // selectOne() 
    // => 결과가 한 개일 때 사용할 수 있다.
    // => 리턴 값은 <select> 태그의 resultType 또는 resultMap 속성에 지정한 클래스이다.
    // => 만약 조건에 해당하는 값이 없다면 null을 리턴한다.
    
    // => 다음과 같이 여러 개의 결과를 리턴하는 SQL을 지정한다면 예외가 발생한다.
    //Board b = sqlSession.selectOne("step15sql.selectList");
    
    // => 한 개 또는 0 개의 결과를 리턴하는 SQL문 이어야 한다.
    Board b = sqlSession.selectOne("step15sql.selectOne");
    
    System.out.printf("%d, %s, %s, %d, %s\n", 
          b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount(), b.getContents());
    
    sqlSession.close();
  }

}




