/* 주제: Mybatis - 값 객체에 대해 별명 지정하기
 * => resultType이나 parameterType 속성에 값 객체를 지정할 때
 *    패키지 이름까지 적어야하기 때문에 너무 버거롭다.
 *    예) <select ... resultType="step15.Board"> 
 *    예) <insert ... parameterType="step15.Board">
 * => 값 객체로 사용할 클래스에 대해 별명을 지정해 놓으면 
 *    resultType 또는 parameterType 속성에 짧은 이름을 사용할 수 있다.
 * => 방법
 *    mybatis 설정 파일(mybatis-config.xml)에 별명을 설정하라!
 *    예)
      <typeAliases>
        <typeAlias type="step15.Board" alias="board"/>
      </typeAliases>
   => SQL 문을 작성할 때 별명을 사용하라!
      예) <select ... resultType="board"> 
      예) <insert ... parameterType="board">
   
   => 이렇게 별명을 사용하면 패키지가 변경되거나 클래스 이름이 변경되더라도 
      SQL 문을 변경할 필요가 없기 때문에 매우 유지보수에 좋다.    
 *    
 */
package step15;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_8 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config2.xml"));
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











