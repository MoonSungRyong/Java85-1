/* 주제: Mybatis - 여러 개의 값을 파라미터로 넘기는 방법
 * => selectList(), selectOne(), insert(), update(), delete()을 호출할 때
 *    SQL 아이디와 값을 넘기는데, 값은 반드시 한 개만 넘길 수 있다.
 *    그래서 보통 값 객체(VO)에 담아서 넘긴다.
 * => 또 다른 방법은 Map 객체에 담아서 넘기면 된다.
 */
package step15;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_10 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config3.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // 특정 페이지의 게시물 가져오기
    // => 시작 인덱스와 개 수를 담아서 넘긴다.
    HashMap<String,Object> params = new HashMap<>();
    params.put("startIndex", (5 - 1) * 3); // 5페이지의 시작 인덱스  
    params.put("length", 3); // 3개
    
    // => SQL 아이디와 맵 객체를 파라미터로 넘긴다.
    // => SQL 태그에 parameterType으로 Map을 지정해야 한다.
    //    예) <select ... parameterType="map">
    List<Board> list = sqlSession.selectList("step15sql.selectList3", params);
    
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











