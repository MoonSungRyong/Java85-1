package designpatterns.proxy.server;

public class CalcImpl implements Calc {

  @Override
  public int plus(int a, int b) {
    return a + b;
  }

  @Override
  public int minus(int a, int b) {
    return a - b;
  }

}
