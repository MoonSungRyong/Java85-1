package designpatterns.decorator;

public abstract class Decorator extends Robot {
  Robot body;
  
  public Decorator(Robot robot) {
    this.body = robot;
  }
}
