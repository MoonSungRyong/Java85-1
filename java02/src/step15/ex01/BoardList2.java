/* 주제: Mybatis - 결과를 가져오기(컬럼과 프로퍼티 이름이 다른 경우 해결책)
 */
package step15.ex01;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardList2 {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("step15/ex01/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // 컬럼 이름과 프로퍼티 이름이 다른 경우,
    // => 컬럼에 프로퍼티 이름과 같은 별명을 부여하라!
    List<Board> list = sqlSession.selectList("step15sql.selectList2");
    
    for (Board b : list) {
      System.out.printf("%d, %s, %s, %d\n", 
            b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount());
    }
    
    sqlSession.close();
  }

}














