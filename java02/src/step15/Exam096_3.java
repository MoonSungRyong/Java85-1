/* 주제: Mybatis - select 컬럼과 객체의 프로퍼티 */
package step15;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_3 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // 1) select 결과를 자바 객체에 담는 방법
    //    => select 컬럼의 이름과 일치하는 프로퍼티에 저장한다.
    //    => 만약 컬럼의 이름과 일치하는 프로퍼티를 찾을 수 없다면
    //       그 컬럼의 값은 저장할 수 없다.
    // 다음 select 문을 실행한 후 그 결과를 살펴보라!
    // => no와 title은 제대로 출력되지만, cre_dt와 vw_cnt 컬럼의 값은 제대로 출력되지 않는다.
    //List<Board> list = sqlSession.selectList("step15sql.selectList");
    
    // 2) select 컬럼의 이름과 객체의 프로퍼티 이름이 다를 때 
    //    제대로 저장하는 방법?
    //    => 컬럼에 프로퍼티와 같은 이름으로 별명을 지정하라!
    List<Board> list = sqlSession.selectList("step15sql.selectList2");
    
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











