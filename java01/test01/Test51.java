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

public class Test51 {
  public static void main(String[] args) throws Exception {
    // 사용자로부터 밑변의 길이를 입력받아 삼각형을 출력하시오
    //   *
    //  ***
    // *****
    Scanner keyScan = new Scanner(System.in);
    int len = Integer.parseInt(keyScan.nextLine());
    
    int i = 1, j, spaceLen = len / 2;
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
