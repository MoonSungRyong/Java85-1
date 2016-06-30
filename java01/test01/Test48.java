/* 문제:
 * 1, 2, 4, 7, 11, 16 ... 100 까지 합을 구하라!
*/
import java.util.Scanner;

public class Test48 {
  public static void main(String[] args) throws Exception {
    int i = 1, value = 1, sum = 0;
    while (value <= 100) {
      sum += value;
      System.out.println(value);
      value += i++;
    }
    System.out.println(sum);
    
  }
  
}




/**/
