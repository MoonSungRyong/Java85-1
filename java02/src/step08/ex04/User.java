package step08.ex04;

public class User {
  String name;
  String email;
  String password;
    
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("User 클래스 로딩");
  }
}
