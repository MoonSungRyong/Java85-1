/* 주제: Mybatis - SQL 실행에 참고할 데이터 전달하기 */
package step15;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_5 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // selectOne("SQL아이디", 값);
    // => 값으로 오직 한 개의 파라미터만 전달 할 수 있다.
    // => 값으로 전달할 파라미터는 반드시 객체이어야 한다.
    // => 단 원시 타입(byte,short,int,long,float,double,boolean,char)을 전달할 경우,
    //    컴파일러는 자동으로 auto-boxing을 수행한다.
    // => auto-boxing?
    //    예) 10 ----> new Integer(10)
    // => SQL 맵퍼에는 어떤 파라미터 값을 받는지 선언해야 한다.
    //    예) <select ... parameterType="int">
    // => 또한 값이 들어갈 자리에 #{프로퍼티명}으로 표시해야 한다.
    //    예) where no = #{value}
    // => 단 원시 타입일 경우 프로퍼티 이름은 아무 이름으로 지정할 수 있다.
    //
    Board b = sqlSession.selectOne("step15sql.selectOne2", 10);
    
    System.out.printf("%d, %s, %s, %d, %s\n", 
          b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount(), b.getContents());
    
    sqlSession.close();
  }

}




