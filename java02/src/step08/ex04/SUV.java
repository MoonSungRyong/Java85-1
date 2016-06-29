package step08.ex04;

public class SUV extends Car {
  int weight;
  
  public SUV() {
    //반드시 첫명령문이 수퍼클래스 생성자 호출이어야 한다.
    // System.out.println("컴파일 오류!"); 
    
    //super(); //<= 수퍼 클래스의 기본 생성자를 호출하는 명령이 숨겨져 있다.
    System.out.println("SUV() 호출됨");
  }
}
