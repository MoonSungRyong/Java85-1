package step10.exam081;

// 인터페이스를 구현하는 클래스는
// 그 인터페이스가 상속받는 인터페이스의 메서드까지 만들어야 한다.
public class MyCar implements BitCar {

  @Override
  public void run() {
    System.out.println("달린다...");
  }

  @Override
  public void openSunroof() {
    System.out.println("썬루프 연다...");
  }

  @Override
  public void start() {
    System.out.println("시동건다...");
  }

  @Override
  public void dump() {
    System.out.println("짐을 내린다....");
  }

  @Override
  public void stop() {
    System.out.println("멈춘다...");
  }

  

}
