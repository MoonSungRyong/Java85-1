package step08.ex05;

public class Car extends Motor {
  int capacity;
  
  {
    System.out.println("Car 인스턴스 블록...");
  }
  
  public Car() {
    //1) super()
    
    //2) 현재 클래스의 인스턴스 블록 호출
    
    //3) 생성자 코드 실행
    System.out.println("Car() 호출됨");
  }
}
