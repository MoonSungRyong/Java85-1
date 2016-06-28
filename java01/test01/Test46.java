/* 문제:
=> 프로그램 아규먼트로 여러 자리의 수를 입력 받아
   홀수의 개수와 짝수의 개수를 센다.
예) java Test46 567845604
홀수:3, 짝수:6
*/
import java.util.Scanner;

public class Test46 {
  public static void main(String[] args) throws Exception {
    int value = Integer.parseInt(args[0]);
    int oddCount = 0, evenCount = 0;
    while (value > 0) {
      if (value % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
      value /= 10;
    }
    System.out.printf("홀수:%d, 짝수:%d\n", oddCount, evenCount);
  }
}




/**/
