/* 문제:
 * => 사용자로부터 숫자를 입력 받아 역순으로 배열하여 출력하라.
 * 예)
243300985
589003342
*/
import java.util.Scanner;

public class Test51 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    int value = Integer.parseInt(keyScan.nextLine());
    int value2 = 0;
    
    while (value > 0) {
      value2 *= 10;
      value2 += value % 10;
      value /= 10;
    }
    
    System.out.println(value2);
  }
  
}




/**/
