package designpatterns.decorator;

public class ThrowDecorator extends Decorator {
  public ThrowDecorator(Robot robot) {
    super(robot);
    body.attackPoint += 5;
  }
  
  @Override
  public void run() {
    body.run();
    System.out.println("슈~~~~웅....맞아라!!!!");
  }

}
