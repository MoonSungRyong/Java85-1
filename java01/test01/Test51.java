/* 문제:
 * => 사용자로부터 숫자를 입력 받아 0부터 9까지 숫자가 등장하는 개수를 출력하라
 * 예)
243300985
0: 2
2: 1
3: 2
4: 1
5: 1
8: 1
9: 1
*/
import java.util.Scanner;

public class Test51 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    int value = Integer.parseInt(keyScan.nextLine());
    
    int[] numCount = new int[10];
    for (int i = 0; i < numCount.length; i++) 
      numCount[i] = 0;
    
    while (value > 0) {
      numCount[value % 10]++;
      value /= 10;
    }
    
    for (int i = 0; i < numCount.length; i++) {
      if (numCount[i] > 0)
        System.out.printf("%d: %d\n", i, numCount[i]);
    }
  }
  
}




/**/
