/* 주제: JDBC - 삭제하기2 : PreparedStatement 사용하기 */
package step13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam091_14 {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   
          "java85", 
          "1111");  
      stmt = con.prepareStatement("delete from boards where no=?");
      
      Scanner keyScan = new Scanner(System.in);
      System.out.print("삭제할 게시물 번호? ");
      int no = keyScan.nextInt();
      keyScan.close();
      
      stmt.setInt(1, no);
      
      int count = stmt.executeUpdate();
      System.out.println(count);
      
      if (count > 0) {
        System.out.println("삭제 성공!");
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














