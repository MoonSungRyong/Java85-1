package step08.ex04;

public class Motor {
  int cc;
  String maker;
  
  public Motor() {
    //super(); //<= 수퍼 클래스의 기본 생성자를 호출하는 명령이 숨겨져 있다.
    //Motor의 수퍼클래스는 누구? 잠시 후 다른 예제에서..
    
    System.out.println("Motor() 호출됨");
  }
}
