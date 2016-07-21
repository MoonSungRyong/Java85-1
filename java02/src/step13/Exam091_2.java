/* 주제: JDBC - java.sql.Driver 구현체2 */
package step13;

import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Exam091_2 {

  public static void main(String[] args) {
    try {
      //1) JDBC 드라이버의 정보를 갖고 있고, 커넥션을 수행하는 클래스를 먼저 로딩한다.
      //   => 아래와 같이 JDBC 드라이버 관리자에게 객체를 직접 등록해도 된다.
      //   => 이 방식의 단점은 자바 코드에서 특정 회사의 클래스를 지정한다는 것이다.
      //   => 엥? 기존의 forName()에서도 문자열로 특정 회사의 클래스를 지정하지 않았는가?
      //      문자열이라는 사실을 주목하라! 문자열은 파일이나 프로그램 아규먼트로 받을 수 있다.
      //      즉 특정 회사의 클래스에 종속되지 않을 방법이 있다.
      //      그러나 아래 방법은 자바 코드로 직접 import하기 때문에 
      //      소스 코드 자체가 특정 회사의 DBMS에 종속될 수 밖에 없다.
      DriverManager.registerDriver(new Driver());
      System.out.println("JDBC 드라이버 클래스 로딩 완료!");
      
      //2) JDBC 드라이버 관리자를 통해 DB 커넥션 객체를 얻는다.
      
      //3) DB 커넥션 객체를 통해 SQL 질의를 수행할 객체를 얻는다.
      
      //4) SQL 질의를 수행하는 객체를 통해 결과를 다룰 객체를 얻는다.
      
      //5) 결과를 다루는 객체를 사용하여 DBMS 서버에서 결과를 가져온다.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}














