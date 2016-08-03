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
    
    /* => 직접 FileInputStream을 사용하여 설정 파일을 읽을 스트림 객체 만들기
        문제점:
        1) 이클립스에서 실행할 때 현재 디렉토리가 프로젝트 폴더이다.
           만약 개발을 완료한 다음, 별도의 디렉토리에 배치한 후 실행한다면?
           => 그 때 현재 위치는 명령어를 실행하는 폴더이다. 프로젝트 폴더가 아니다.
           => 또한 사용자에게 배포할 때 소스 폴더까지 배포하는 것은 아니다.
    */ 
    //FileInputStream inputStream = new FileInputStream("src/step15/mybatis-config.xml");
    
    /* 해결책:
       => 설정 파일을 자바 클래스 파일이 있는 폴더(bin)에 둔다.
       => 그리고 설정 파일을 찾을 때 바로 이 자바 클래스 파일이 있는 경로에서 찾는다.
          자바 클래스 파일이 있는 경로를 "classpath"라고 부른다.
          프로젝트 폴더를 예를 들면 "bin"이라는 폴더가 바로 classpath이다.
       => 이클립스는 src 폴더에 있는 .java 파일을 컴파일하고 
          컴파일 결과로 생성된 .class 파일을 bin 폴더에 둔다.
          자바 소스 파일이 아닌 다른 파일들은 그냥 그대로 그 위치에 대응하여
          bin 폴더에 복사한다.
          그래서 mybatis-config.xml 파일도 bin 폴더에 복사되어 있다.
       => mybatis에서 제공하는 Resouces.getResourceAsStream() 메서드는
          파라미터로 주어진 파일을 자바 classpath에서 찾는다.
          따라서 FileInputStream을 사용하는 것 보다 더 편하다.
     */
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









