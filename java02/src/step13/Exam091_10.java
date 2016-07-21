/* 주제: JDBC - 입력하기2 */
package step13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exam091_10 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    Connection con = null;
    Statement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   
          "java85", 
          "1111");  
      stmt = con.createStatement();
      
      System.out.print("제목? ");
      String title = keyScan.nextLine();
      System.out.print("내용? ");
      String content = keyScan.nextLine();
      
      stmt.executeUpdate("insert into boards(title,conts,cre_dt)"
          + " values('" + title + "', '" + content + "', now())");
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {stmt.close();} catch (Exception e) {}
      try {con.close();} catch (Exception e) {}
    }
    keyScan.close();
  }

}














