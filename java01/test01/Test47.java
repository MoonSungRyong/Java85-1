/* 문제:
사용자로부터 삼각형의 밑변의 길이를 입력받아 삼각형을 그린다.
=> while문 사용
  *
 ***
*****
*/
import java.util.Scanner;

public class Test47 {
  public static void main1(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
    System.out.println(len);
  }
  
  public static void main2(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 0;
    while (i < len) {
      System.out.println("*");
      i++;
    }
  }
  
  public static void main3(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 0;
    while (i < len) {
      System.out.println("*");
      i += 2;
    }
  }
  
  public static void main4(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 1, j = 0;
    while (i <= len) {
      j = 0;
      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i += 2;
    }
  }
  
  public static void main5(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 1, j = 0, spaceLen = len / 2;
    while (i <= len) {
      System.out.print(spaceLen);
      spaceLen--;
      
      j = 0;
      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i += 2;
    }
  }
  
  public static void main6(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 1, j = 0, spaceLen = len / 2;
    while (i <= len) {
      j = 0;
      while (j < spaceLen) {
        System.out.print(" ");
        j++;
      }
      spaceLen--;
      
      j = 0;
      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i += 2;
    }
  }
  
  public static void main(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("밑변의 길이는? ");
    int len = Integer.parseInt(keyScanner.nextLine());
   
    int i = 1, j = 0, spaceLen = len / 2;
    while (i <= len + 1) {
      j = 0;
      while (j < spaceLen) {
        System.out.print(" ");
        j++;
      }
      spaceLen--;
      
      j = 0;
      while (j < i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i += 2;
    }
  }
  
}




/**/
