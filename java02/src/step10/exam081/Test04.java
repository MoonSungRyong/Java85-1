/* 주제: 인터페이스 사용법 - 인터페이스의 다중 상속 */
package step10.exam081;

public class Test04 {

  public static void main(String[] args) {
    MyCar car = new MyCar();
    
    car.start();  // Motor 인터페이스로부터 상속받은 메서드
    car.run();    // Sedan과 Truck 인터페이스로부터 상속받은 메서드
    car.dump();   // Truck 인터페이스로부터 상속받은 메서드
    car.openSunroof();  // Sedan 인터페이스로부터 상속받은 메서드
    car.stop(); // BitCar 인터페이스로부터 상속받은 메서드
    
  }

}
