/* 주제: JDBC - 결과를 가져오기 */
package step15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exam096_2 {

  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try {
      //1) JDBC 드라이버의 정보를 갖고 있고, 커넥션을 수행하는 클래스를 먼저 로딩한다.
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("JDBC 드라이버 클래스 로딩 완료!");

      //2) JDBC 드라이버 관리자를 통해 DB 커넥션 객체를 얻는다.
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   /* JDBC URL; 접속할 DBMS URL */ 
          "java85", /* user name*/
          "1111");  /* user password*/
      System.out.println("연결 성공!");
      
      //3) DB 커넥션 객체를 통해 SQL 질의를 수행할 객체를 얻는다.
      stmt = con.createStatement();
      System.out.println("질의 객체 얻기 성공!");
      
      //4) SQL 질의를 수행하는 객체를 통해 결과를 다룰 객체를 얻는다.
      rs = stmt.executeQuery("select * from boards");
      System.out.println("결과를 다룰 객체를 얻었다!");
      
      //5) 결과를 다루는 객체를 사용하여 DBMS 서버에서 결과를 가져온다.
      while (rs.next()) { // 서버에서 레코드(행, row)를 한 개 가져온다.
        // 가져온 값을 꺼내 출력해보자!
        System.out.printf("%d, %s, %s, %d\n", 
            rs.getInt("no"), rs.getString("title"), rs.getDate("cre_dt"), rs.getInt("vw_cnt"));
      }
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

}














