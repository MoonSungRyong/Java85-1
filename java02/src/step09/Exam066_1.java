package step09;

public class Exam066_1 {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    if (s1 == s2) {
      System.out.println("s1 == s2");
    }

    String s3 = new String("Hello");
    String s4 = new String("Hello");
    if (s3 == s4) {
      System.out.println("s3 == s4");
    }
  }

}
