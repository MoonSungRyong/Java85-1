/* 주제: JDBC - DB 커넥션 객체 얻기 */
package step13;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exam091_3 {

  public static void main(String[] args) {
    Connection con = null;
    try {
      //1) JDBC 드라이버의 정보를 갖고 있고, 커넥션을 수행하는 클래스를 먼저 로딩한다.
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 클래스 로딩 완료!");

      //2) JDBC 드라이버 관리자를 통해 DB 커넥션 객체를 얻는다.
      //   => DriverManager에게 접속할 DBMS 정보를 알려준다.
      //   => DriverManager는 로딩된 클래스(java.sql.Driver 구현체) 중에서 
      //      그 DBMS에 접속할 수 있는 Driver를 찾는다. 예) com.mysql.jdbc.Driver 클래스 
      //   => DriverManager 그 드라이버 객체에게 DB에 연결해 달라고 요청한다.
      //   => com.mysql.jdbc.Driver 객체는 DB에 연결을 수행하고 
      //      그 연결 정보를 다룰 java.sql.Connection 인터페이스 구현체를 리턴한다.
      //   => DriverManager의 getConnection()을 호출했다고 해서 DriverMangager가 직접
      //      DBMS에 접속한 것은 아니다.
      //      그 작업은 위에서 로딩한 드라이버 클래스가 대신한다.
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   /* JDBC URL; 접속할 DBMS URL */ 
          "java85", /* user name*/
          "1111");  /* user password*/
      System.out.println("연결 성공!");
      
      //3) DB 커넥션 객체를 통해 SQL 질의를 수행할 객체를 얻는다.
      
      //4) SQL 질의를 수행하는 객체를 통해 결과를 다룰 객체를 얻는다.
      
      //5) 결과를 다루는 객체를 사용하여 DBMS 서버에서 결과를 가져온다.
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {con.close();} catch (Exception e) {}
    }
  }

}














