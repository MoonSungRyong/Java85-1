package framework;

public class BitMotor implements Motor {
  int charge = 100;
  
  @Override
  public int chargeState() {
    return charge;
  }

  @Override
  public void execute() {
    System.out.println("스르르륵.... 간다...");
  }

}
