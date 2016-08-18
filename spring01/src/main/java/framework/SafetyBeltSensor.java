package framework;

public class SafetyBeltSensor implements Sensor {
  @Override
  public void check() {
    System.out.println("안전벨트 착용 검사중....");
  }
}
