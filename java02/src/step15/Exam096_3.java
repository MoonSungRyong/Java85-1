/* 주제: JDBC - 입력하기3 : PreparedStatement 사용하기
 * PreparedStatement 사용 이점
 * 1) Statement 보다 코드가 간결하다.  
 * 2) PreparedStatement는 SQL문을 미리 컴파일 하기 때문에 속도 빠르다.
 *    SQL문을 날것 그대로 서버에 보내는 것이 아니다.
 *    서버에 보내기 전에 그 DBMS가 원하는 형식으로 바꾼 다음(SQL 컴파일이라고 보통 표현) 보낸다.
 *    executeUpdate(SQL)을 호출할 때는 실행할 때 마다 SQL문을 컴파일 한다.
 *    그러나 PreparedStatement인 경우 미리 SQL문을 컴파일 한 다음 값을 넣어서 
 *    보내기 때문에 한 번 실행할 때는 Statement와 속도가 거의 같지만,
 *    반복문 속에서 여러 번 실행할 때는 매번 컴파일하는 Statement보다 속도가 빠르다.
 * 3) 바이너리 값을 SQL문에 넣을 수 있다.
 *    => Statement는 SQL문을 문자열로 표현하기 때문에 바이너리 데이터를 넣을 수 없다.
 * 4) 보안성이 좋다.
 *    => Statement는 사용자가 입력한 값을 가지고 SQL문을 생성하기 때문에,
 *       SQL문에 해킹 코드를 삽입하기가 쉽다.
 *    => 그러나 PreparedStatement는 사용자가 입력한 값은 그냥 값으로 받기 때문에 
 *       SQL을 변형시킬 수가 없다.
 *     
 *    
 */
package step15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam096_3 {

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
      
      //1) 미리 SQL을 준비한다.
      //   => 단 값을 넣을 자리는 ?로 표시한다.
      //   => 숫자나 문자 상관없이 ?로 표시한다.
      //   => 이 ?를 in-parameter라고 부른다.
      stmt = con.prepareStatement(
          "insert into boards(title,conts,cre_dt) values(?,?,now())");
      
      System.out.print("제목? ");
      String title = keyScan.nextLine();
      System.out.print("내용? ");
      String content = keyScan.nextLine();
      
      //2) SQL의 빈 자리를 값으로 채운다.
      //   => 파라미터 인덱스는 1부터 시작한다. 0부터가 아니다. 주의!
      //   => 값을 넣는 순서는 상관없다. 1부터 순서대로 채울 필요는 없다.
      //      그러나 코드를 해석하기 쉽고 읽기 쉽도록 순서대로 넣어라!
      stmt.setString(1, title);
      stmt.setString(2, content);

      //3) SQL을 실행한다.
      //   => 이미 SQL을 준비했기 때문에 파라미터로 SQL문을 넘길 필요는 없다.
      stmt.executeUpdate();
      
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














