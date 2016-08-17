package step12;

public class PressFactory3 {
  public Press createInstance(String name, String tel) {
    Press p = new Press(name, tel);
    return p;
  }
}
