package designpatterns.command.before;

import java.util.Scanner;

public class CalcTest {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    int a, b;
    String op;
    
    while (true) {
      System.out.print("명령> ");
      a = keyScan.nextInt();
      op = keyScan.next();
      b = keyScan.nextInt();
      
      switch (op) {
      case "+": doPlus(a, b); break;
      case "-": doMinus(a, b); break;
      }
    }
  }

  private static void doMinus(int a, int b) {
    System.out.printf("%d - %d = %d\n", a, b, a - b);
  }

  private static void doPlus(int a, int b) {
    System.out.printf("%d + %d = %d\n", a, b, a + b);
  }
}







