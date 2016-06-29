package step08.ex05;

public class User {
  String name;
  String email;
  String password;
    
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("static {} 블록 1...");
  }
  
  public User() {
    System.out.println("User() 호출됨");
  }
  
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("static {} 블록 2...");
  }
}
