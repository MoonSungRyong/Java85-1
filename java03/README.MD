# 스프링 사용법 - IoC 컨테이너
## src01 - 게시판에 Gradle 적용
## src02 - Spring과 Mybatis 연동
- Mybatis는 스프링과 연동을 위해 SqlSessionFactoryBean 클래스를 제공한다.
  우리가 만든 SqlSessionFactoryFactoryBean 대신에 
  Mybatis에서 제공하는 클래스를 사용하자!
1) mybatis-spring 의존 라이브러리를 다운로드 받아서 추가한다.
   => build.gradle
2) 스프링 설정 파일에 mybatis 객체 정보 추가한다.
   => application-context.xml
3) DAO 인터페이스 변경
   => mybatis-spring 라이브러리의 MapperScannerConfigurer 객체를 이용하여 
      DAO 구현체를 자동으로 만들 수 있다.
   => 단 다음 조건이 만족되어야 한다.
      - 인터페이스의 모든 메서드는 한 개의 파라미터 값만 가질 수 있고,
        SQL 맵퍼의 파라미터 선언과 같아야 한다.
      - 메서드 이름과 SQL의 ID 이름이 같아야 한다.
      - SQL 맵퍼 파일의 네임스페이스는 DAO 전체 이름과 같아야 한다.
   => 스프링 설정 파일에 MapperScannerConfigurer 객체를 등록하라!











   
   
   
   
   
