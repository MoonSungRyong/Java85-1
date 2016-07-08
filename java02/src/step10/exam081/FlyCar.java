// 주제: 다중 인터페이스 구현
package step10.exam081;

// => 클래스는 한 개 이상의 인터페이스를 구현할 수 있다.
// => 같은 시그너처를 가진 메서드가 있는 경우 한 개만 구현하면 된다.
// 
public class FlyCar implements Fly, Car {
  // run()은 Fly와 Car 모두에 있는 메서드이다.
  // 한 개만 만들면 된다.
  @Override
  public void run() {
    System.out.println("달린다....");
  }
  
  @Override
  public void takeOff() {
    System.out.println("이륙한다....");
  }
  
  @Override
  public void stop() {
    System.out.println("멈춘다....");
  } 

}
