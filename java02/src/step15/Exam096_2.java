/* 주제: Mybatis - SQL 실행하기 */
package step15;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_2 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // 1) selectList("SQL 아이디", 데이터객체) 
    //    => SELECT 문을 실행할 때 사용한다.
    //    => 리턴 값은 List 객체이다.
    //    => SQL 아이디 = [SQL Mapper 파일의 namespace] + "." + [SQL 태그의 아이디]
    //
    List<Board> list = sqlSession.selectList("step15sql.selectList");
    
    // 2) 리턴 값 "List"에 저장된 개체(Board)는 어떻게 결정되는가?
    //    => SQL 맵퍼 파일의 <select> 태그에서 resultType 또는 resultMap 속성에 
    //       지정한 클래스가 List에 저장되는 객체이다.
    //    => mybatis는 select를 실행한 후 그 결과를 resultType 또는 resultMap에 지정한 
    //       객체 담는다. 
    //       그리고 그 객체를 List에 담아서 리턴한다.
    //       
    for (Board b : list) {
      System.out.printf("%d, %s, %s, %d\n", 
            b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount());
    }
    
    sqlSession.close();
  }

}


/* SQL 맵퍼 파일의 namespace?
 * 예) <mapper namespace="step15sql">
 * 
 * SQL 태그의 아이디?
 * 예) <select id="selectList" ...>
 * 
 * SQL 아이디?
 * => "step15sql" + "." + "selectList" => "step15sql.selectList"
 * 
 * SQL 맵퍼 파일이 namespace가 존재하는 이유?
 * => SQL문을 그룹으로 묶어 관리하기 위함.
 * 
 * selectList()가 리턴한 List에 저장되는 값은?
 * => <select> 태그의 resultType/resultMap 속성에 지정된 객체이다.
 * 예) <select ... resultType="step15.Board">
 * 
 */











