/* 주제: Mybatis - 컬럼 이름과 프로퍼티 이름을 연결하기
 * => 매번 SQL문을 작성할 때 마다 프로퍼티 이름과 다른 컬럼에 대해
 *    별명을 지정한다면 SQL문이 매우 지저분해진다.
 * => 그래서 미리 컬럼 이름과 프로퍼티 이름을 연결해두고,
 *    그 정보를 사용하여 결과를 다룬다면 매우 편리할 것이다.
 * => 방법
 *    - SQL 맵퍼 파일에 컬럼 이름과 프로퍼티 이름을 연결한 정보를 설정하라!
 *    예) 
      <resultMap type="step15.Board" id="boardMap">
        <!-- PK 컬럼은 id 태그를 사용해 정의한다. -->
        <id column="no" property="no"/> 
        
        <!-- 컬럼이름과 프로퍼티 이름이 같을 경우 선언하지 않아도 된다. -->
        <!--  
        <result column="title" property="title"/> 
        <result column="writer" property="writer"/>
        <result column="password" property="password"/>
        -->
        
        <!-- 컬럼 이름과 프로퍼티 이름이 다를 경우 다음과 같이 연결 정보를 설정한다. -->
        <result column="conts" property="contents"/>
        <result column="cre_dt" property="createdDate"/>
        <result column="vw_cnt" property="viewCount"/>
      </resultMap>
    
      - select 태그에서 resultType 대신 resultMap 속성을 사용하라!
        resultMap 속성의 값은 SQL 맵퍼 파일에 정의한 <resultMap> 태그의 아이디이다.
        또한 각 컬럼에 지정한 별명을 제거하라!
      예)
      <select id="selectList2" resultMap="boardMap">
        select no,title,cre_dt,vw_cnt 
        from boards
      </select>
 *    
 */
package step15;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_9 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config3.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
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











