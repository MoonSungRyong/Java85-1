package designpatterns.decorator;

public class WorkerRobot extends Robot {
  public WorkerRobot() {
    modelName = "작업로봇";
  }
  
  @Override
  public void run() {
    System.out.println("열심히 일한다.");
  }
}
