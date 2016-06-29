package step08.ex05;

public class User2 {
  String name;
  String email;
  String password;
  String photo;
    
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("static {} 블록 1...");
  }
  
  public User2() {
    System.out.println("User2() 호출됨");
    
    this.email = "hong@test.com";
    this.password = "1111";
  }
  
  public User2(String email, String password) {
    System.out.println("User2(String,String) 호출됨");
    
    this.email = email;
    this.password = password;
  }
  
  { // 인스턴스 블록 
    System.out.println("인스턴스 블록 1...");
    this.name = "홍길동";
  }
  
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("static {} 블록 2...");
  }
  
  { // 인스턴스 블록 
    System.out.println("인스턴스 블록 2...");
    this.photo = "anonymous.gif";
  }
}
