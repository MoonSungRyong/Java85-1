/* 주제: Mybatis - 오토 커밋 모드 설정 */
package step15;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_7 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    
    // SqlSession 객체를 준비할 때 openSession()의 파라미터 값으로 true를 주면
    // 오토 커밋 모드로 동작한다.
    // => 오토 커밋 모드에서는 따로 commit()을 호출할 필요가 없다.
    // => 왜냐하면 SQL을 실행할 때 마다 자동으로 commit()을 호출하기 때문이다.
    // => 실무에서는 오토 커밋을 사용하지 않는다.
    //    이유? 실행 조건에 따라 저장할 지 취소할 지 정교하게 조정해야 하기 때문이다.
    // => 따라서 가능한 Exam096_6.java 처럼 직접 commit()을 사용하라! 
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    
    Board board = new Board();
    board.setTitle("제목입니다2");
    board.setContents("내용입니다2");
    board.setPassword("1111");
    
    int count = sqlSession.insert("step15sql.insert", board);
    
    if (count > 0)
      System.out.println("입력 성공입니다");
    else
      System.out.println("입력 실패입니다");
    sqlSession.close();
  }

}





