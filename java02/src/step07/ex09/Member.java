package step07.ex09;

public class Member {
  String name;
  String email;
  String password;
  String signedUpDate;
  
  public Member() {
    java.sql.Date today = new java.sql.Date(System.currentTimeMillis());
    String str = today.toString();
    this.signedUpDate = str;
  }
  
  public Member(String name, String email, String password) {
    this();
    this.name = name;
    this.email = email;
    this.password = password;
  }
}
