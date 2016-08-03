/* 주제: Mybatis - 결과를 가져오기 */
package step15.ex01;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardList {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = Resources.getResourceAsStream("step15/ex01/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // SELECT 문 실행
    // 1) selectList()  => 결과가 여러 개일 경우에 사용. List를 리턴한다.
    // 2) selectOne()   => 결과가 단 한 개일 때 사용. 지정된 객체를 리턴한다.
    //
    // 파라미터 문법
    // => "네임스페이스이름.SQL아이디"
    //
    // 결과 
    // => 컬럼 값은 컬럼 이름과 일치하는 프로퍼티에 저장한다.
    // => 만약 컬럼 이름과 일치하는 프로퍼티를 찾을 수 없다면 그 컬럼의 값은 객체에 저장되지 않는다.
    // 
    // 컬럼 이름과 프로퍼티 이름이 다른 경우,
    // => 컬럼에 프로퍼티 이름과 같은 별명을 부여하라!
    //
    // 다음 코드는 컬럼과 프로퍼티 이름이 같지 않는 경우이다.
    // 예) cre_dt ---> createdDate, vw_cnt ---> viewCount
    // 그래서 게시물 등록일과 조회수가 제대로 출력되지 않는다.
    List<Board> list = sqlSession.selectList("step15sql.selectList");
    
    for (Board b : list) {
      System.out.printf("%d, %s, %s, %d\n", 
            b.getNo(), b.getTitle(), b.getCreatedDate(), b.getViewCount());
    }
    
    sqlSession.close();
  }

}














