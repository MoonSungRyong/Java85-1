/* 주제: Mybatis - SQL 실행에 참고할 데이터 전달하기2 */
package step15;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_6 {

  public static void main(String[] args) throws Exception {
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
          Resources.getResourceAsStream("step15/mybatis-config.xml"));
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // insert() : 객체 전달하기 
    // => 리턴 값은 insert 한 레코드의 개수이다.
    // => 파라미터로 insert 할 때 사용할 값 객체를 넘긴다.
    // => <insert> 태그에 파라미터 타입을 지정해야 한다.
    //    예) <insert ... parameterType="step15.Board">
    // => SQL에서는 #{프로퍼티명}을 사용하여 값 객체에서 데이터를 꺼낸다.
    //    예) values(#{title}, #{contents}, #{password}, now())
    // => 주의!
    //    insert/update/delete의 경우 SQL을 실행한 다음 반드시 DBMS에게
    //    저장하라고 명령을 내려야 한다.
    //    예) sqlSession.commit();
    Board board = new Board();
    board.setTitle("제목입니다");
    board.setContents("내용입니다");
    board.setPassword("1111");
    
    int count = sqlSession.insert("step15sql.insert", board);
    sqlSession.commit();
    
    if (count > 0)
      System.out.println("입력 성공입니다");
    else
      System.out.println("입력 실패입니다");
    sqlSession.close();
  }

}

/* commit/rollback?
 * => insert/update/delete과 같은 DML 명령을 사용하는 경우 
 *    그 실행 결과는 DBMS의 임시 데이터베이스에 보관된다.
 * => commit 명령을 받으면, 임시 데이터베이스에 보관된 결과를 실제 데이터베이스에 저장한다.
 * => 만약 rollback 명령을 받는다면, 임시 데이터베이스에 보관된 실행 결과를 취소한다.
 * => Mybatis의 경우 기본 모드가 수동 커밋이다.
 *    따라서 DML을 실행할 때 마다 commit()을 호출해 줘야 한다. 
 *
 * 
 *  
 * SQL 분류
 * => DQL(Data Query Language) : select
 * => DML(Data Manipulation Language) : insert, update, delete
 * => DDL(Data Definition Language) : create, drop, alter ...
 */














