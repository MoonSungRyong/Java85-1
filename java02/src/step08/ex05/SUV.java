package step08.ex05;

public class SUV extends Car {
  int weight;
  
  {
    System.out.println("SUV 인스턴스 블록...");
  }
  
  public SUV() {
    //1) super()
    
    //2) 현재 클래스의 인스턴스 블록 호출
    
    //3) 생성자 코드 실행
    System.out.println("SUV() 호출됨");
  }
}
