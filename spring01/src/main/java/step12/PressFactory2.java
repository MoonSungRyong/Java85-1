package step12;

public class PressFactory2 {
  public static Press createInstance(String name, String tel) {
    Press p = new Press(name, tel);
    return p;
  }
}
