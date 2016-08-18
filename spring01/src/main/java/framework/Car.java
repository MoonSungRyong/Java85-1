package framework;

public class Car {
  Sensor[] sensors;
  Motor motor;
  
  public void setSensors(Sensor[] sensors) {
    this.sensors = sensors;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void run() {
    executeSensor();
    
    if (motor != null && motor.chargeState() > 5) {
      motor.execute();
    } else {
      System.out.println("엔진 가동~~ 붕~~~~");
    }
  }
  
  private void executeSensor() {
    if (sensors == null) 
      return;
    
    for (int i = 0; i < sensors.length; i++) {
      sensors[i].check();
    }
  }

}






