package designpatterns.decorator;

public class Test01 {

  public static void main(String[] args) {
    //1) 데코레이터 붙이기 전
    WorkerRobot w1 = new WorkerRobot();
    w1.run();
    System.out.println("---------------");
    
    //2) SwordDecorator 붙이기
    SwordDecorator d1 = new SwordDecorator(w1);
    d1.run();
    System.out.println("---------------");
    
    //3) GunDecorator 붙이기
    GunDecorator d2 = new GunDecorator(w1);
    d2.run();
    System.out.println("---------------");
    
    //4) SwordDecorator에다가 ThrowDecorator를 덧 붙인다.
    ThrowDecorator d3 = new ThrowDecorator(d2);
    d3.run();
  }

}
