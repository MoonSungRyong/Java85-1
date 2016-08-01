package designpatterns.command.after;

public class PlusCommand implements Command {
  @Override
  public void execute(int a, int b) {
    System.out.printf("%d + %d = %d\n", a, b, a + b);
  }
}
