package step12;

public class PressFactory1 {
  public static Press createInstance() {
    Press p = new Press("비트출판사", "1111-1111");
    return p;
  }
}
