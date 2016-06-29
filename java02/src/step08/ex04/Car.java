package step08.ex04;

public class Car extends Motor {
  int capacity;
  
  public Car() {
    //super(); //<= 수퍼 클래스의 기본 생성자를 호출하는 명령이 숨겨져 있다.
    System.out.println("Car() 호출됨");
  }
}
