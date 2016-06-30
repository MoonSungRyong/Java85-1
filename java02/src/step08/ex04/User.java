package step08.ex04;

public class User {
  static int count;
  String name;
  String email;
  String password;
    
  static { // 스태틱 블록: 클래스가 로딩된 후 자동으로 실행되는 블록 
    System.out.println("User 클래스 로딩");
  }
  
  static void increaseCount() {
    count++; // 같은 클래스에 소속된 경우, 스태틱 변수나 메서드를 사용할 때 클래스 이름 생략 가능. 
  }
}
