package designpatterns.decorator;

public class SwordDecorator extends Decorator {
  public SwordDecorator(Robot robot) {
    super(robot);
    body.attackPoint += 10;
  }
  
  @Override
  public void run() {
    body.run();
    System.out.println("챙~~ 챙챙~~~ 죽어~~~");
  }
}
