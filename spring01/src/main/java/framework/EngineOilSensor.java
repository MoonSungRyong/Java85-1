package framework;

public class EngineOilSensor implements Sensor {
  @Override
  public void check() {
    System.out.println("엔진오일 점검중...");
  }
}
