/* 주제: Mybatis 프레임워크 - 준비
 * => Mybatis 라이브러리 파일 다운로드
 *    => 홈페이지: www.mybatis.org
 *    => 다운로드 경로: java02/libs/*.jar 
 * => 자바 classpath에 라이브러리 경로 추가
 *    => 프로젝트 속성창 > Java Build Path > Libraries 에 .jar 파일 추가
 * => Mybatis 설정 파일 준비 
 *    => 홈페이지 문서 참조하여 설정 파일 준비
 *       예) src/step15/mybatis-config.xml <== 파일명은 자유!
 * => SQL Mapper 파일 준비
 *    => SQL이 들어있는 파일
 *    => 홈페이지 문서 참조하여 SQL 맵퍼 파일 준비
 *       예) src/step15/BoardMapper.xml <== 파일명은 자유!      
 */
package step15;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam096_1 {

  public static void main(String[] args) throws Exception {
    // 1) Mybatis 설정 파일을 읽을 입력 스트림을 준비한다.
    //    => Resources.getResourceAsStream() 메서드는 파라미터로 지정된 파일을
    //       classpath 경로에서 찾는다.
    InputStream inputStream = Resources.getResourceAsStream("step15/mybatis-config.xml");
    System.out.println("Mybatis 설정 파일을 읽어들일 입력 스트림 준비되었음");
    
    // 2) SqlSession 객체를 만들어줄 공장 객체를 얻는다.
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    System.out.println("SqlSession 객체를 만들어줄 공장 객체를 준비했음");
    
    // 3) SQL 맵퍼 파일에서 SQL문을 꺼내 실행할 도구를 얻는다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    System.out.println("SqlSession 도구를 준비했음");
    
    // 4) SQL을 실행한다.
    //    => 이번 예제는 여기까지... 
    //    => 다음 예제에서 본격적으로 테스트!
    System.out.println("SQL을 실행했다고 가정하고...");
    
    // 5) 도구를 사용했으면 닫는다.
    sqlSession.close();
    System.out.println("SqlSession 도구를 사용한 후 닫았음");
  }

}









