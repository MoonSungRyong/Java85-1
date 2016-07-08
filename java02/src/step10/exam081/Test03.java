/* 주제: 인터페이스 사용법 - 다중 인터페이스 구현 */
package step10.exam081;

public class Test03 {

  public static void main(String[] args) {
    // Fly 규칙과 Car 규칙을 동시에 구현한 클래스가 있다.
    FlyCar obj = new FlyCar();
    
    // 당연히 이 객체는 Fly 규칙에 따르기 때문에 Fly 레퍼런스에 저장할 수 있다.
    Fly fly = obj;
    
    // 또한 이 객체는 Car 규칙에 따르기 때문에 Car 레퍼런스에 저장할 수 있다.
    Car car = obj;
    
    fly.run();
    fly.takeOff();
    
    car.run();
    car.stop();
    
  }

}
