/* 주제: String 클래스 - toUpperCase(), toLowerCase(), trim()
 */
package step09;

import java.util.Scanner;

public class Exam067_9 /*extends Object*/ {
  public static void main(String[] args) {
    String str1 = "   Hello, World!  ";
    System.out.printf("[%s]\n", str1.toUpperCase());
    System.out.printf("[%s]\n", str1.toLowerCase());
    System.out.printf("[%s]\n", str1.trim());
    
    Scanner keyScan = new Scanner(System.in);
    System.out.print("입력?(y/n) ");
    String message = keyScan.nextLine();
    if (message.trim().toLowerCase().equals("y")) {
      System.out.println("y를 입력하셨습니다.");
    } else {
      System.out.println("n를 입력하셨습니다.");
    }
    keyScan.close();
  }

}






