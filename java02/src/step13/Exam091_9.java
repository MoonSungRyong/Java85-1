/* 주제: JDBC - 변경하기 */
package step13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exam091_9 {

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
      int count = stmt.executeUpdate("update boards set title='haha', conts='xxxx' where no=18");
      System.out.println(count);
      if (count > 0) {
        System.out.println("변경 성공!");
      } else {
        System.out.println("번호에 해당하는 게시물이 없어요!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
  }

}














