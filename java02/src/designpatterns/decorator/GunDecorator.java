package designpatterns.decorator;

public class GunDecorator extends Decorator {
  public GunDecorator(Robot robot) {
    super(robot);
    body.attackPoint += 30;
  }
  
  @Override
  public void run() {
    body.run();
    System.out.println("드드드~~ 드드~~ 죽어~~~~");
  }

}
