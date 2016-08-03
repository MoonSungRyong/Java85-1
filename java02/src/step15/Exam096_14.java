/* 주제: Mybatis - 조건에 따라 정렬 조건 바꾸기 
 * => order by SQL문을 동적으로 만들기
 */
package step15;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_14 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config3.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    HashMap<String,Object> params = new HashMap<>();
    //params.put("noOrder", "asc");
    
    List<Board> list = sqlSession.selectList("step15sql.selectList7", params);
    
    for (Board b : list) {
      System.out.printf("%d, %s, %s, %d\n", 
            b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount());
    }
    
    sqlSession.close();
  }

}

/* select 컬럼과 Board 클래스의 프로퍼티
 * no           ---> no
 * title        ---> title
 * cre_dt       -X-> createdDate
 * vw_cnt       -X-> viewCount
 * conts        -X-> contents
 * writer       ---> writer
 * password     ---> password
 * 
 * select 컬럼에 별명을 지정하는 방법
 * => select 컬럼명 (as) 별명, 컬럼명 (as) 별명 ...
 * => as는 생략 가능하다!
 */











