/* 주제: JDBC - 입력하기 */
package step13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exam091_7 {

  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   
          "java85", 
          "1111");  
      stmt = con.createStatement();
      
      // insert, update, delete 은 executeUpdate() 메서드를 호출한다.
      stmt.executeUpdate("insert into boards(title,conts,cre_dt)"
          + " values('okok', 'ㅋㅋㅋ', now())");
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

}














