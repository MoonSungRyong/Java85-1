/* 주제: JDBC - java.sql.Driver 구현체 */
package step13;

public class Exam091_1 {

  public static void main(String[] args) {
    try {
      //1) JDBC 드라이버의 정보를 갖고 있고, 커넥션을 수행하는 클래스를 먼저 로딩한다.
      //   => java.sql.Driver 인터페이스를 구현한 클래스를 말한다.
      //   => MySQL JDBC 드라이버에 있는 클래스 중에서 com.mysql.jdbc.Driver 클래스가 이에 해당한다.
      Class.forName("com.mysql.jdbc.Driver");
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














