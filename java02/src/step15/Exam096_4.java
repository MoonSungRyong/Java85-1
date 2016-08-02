/* 주제: JDBC - 변경하기3 : PreparedStatement 사용하기 */
package step15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam096_4 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    Connection con = null;
    PreparedStatement stmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/java85db",   
          "java85", 
          "1111");  
      stmt = con.prepareStatement("update boards set title=?, conts=? where no=?");
      
      System.out.print("번호? ");
      int no = Integer.parseInt(keyScan.nextLine());
      System.out.print("제목? ");
      String title = keyScan.nextLine();
      System.out.print("내용? ");
      String content = keyScan.nextLine();
      
      stmt.setString(1, title);
      stmt.setString(2, content);
      stmt.setInt(3, no);
      
      int count = stmt.executeUpdate();
      
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
    keyScan.close();
  }

}














