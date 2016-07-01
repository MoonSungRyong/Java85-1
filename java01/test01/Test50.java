/* 문제:
 * => 2단에서 18단까지 구구단을 출력한다.
 * => 2, 3, 5, 8, 12, ... 식으로 단을 증가시키면서 구구단을 출력한다.
 * => 단이 짝수이면 짝수 곱만 출력하고, 단이 홀수이면 홀수 곱만 출력한다.
 * 예)
 * 2 * 2 = 4
 * 2 * 4 = 8
 * 2 * 6 = 12
 * 2 * 8 = 16
 * 3 * 1 = 3
 * 3 * 3 = 9
 * 3 * 5 = 15
 * 3 * 7 = 21
 * 3 * 9 = 27
 * 5 * 1 = 5
 * ...
*/
import java.util.Scanner;

public class Test50 {
  public static void main1(String[] args) throws Exception {
    int i = 2;
    
    while (i <= 18) {
      System.out.printf("%d * ? = ?\n", i);
      i++;
    }
  }
  
  public static void main2(String[] args) throws Exception {
    int i = 2, j;
    
    while (i <= 18) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      i++;
    }
  }
  
  public static void main3(String[] args) throws Exception {
    int i = 2, j, k = 1;
    
    while (i <= 18) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      i += k;
      k++;
    }
  }
  
  public static void main(String[] args) throws Exception {
    int i = 2, j, k = 1;
    
    while (i <= 18) {
      if (i % 2 == 0) {
        j = 2;
      } else {
        j = 1;
      }
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j += 2;
      }
      i += k;
      k++;
    }
  }
  
}




/**/
