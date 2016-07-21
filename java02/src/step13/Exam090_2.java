/* 주제: 예외 처리 - 소개 */
package step13;

import java.util.Scanner;

public class Exam090_2 {

  public static void main(String[] args) {
    // 예외 처리 후
    Scanner keyScan = new Scanner(System.in);
    int a, b;
    
    while (true) {
      System.out.print("a / b? ");
      try {
        a = keyScan.nextInt();
        b = keyScan.nextInt();
        System.out.printf("결과는 %d입니다.\n", a / b);
      } catch (Exception e) {
        System.out.println("실행 중 오류가 발생했습니다.\n다시 시도해 주세요!");
        keyScan.nextLine(); // 오류가 발생했을 때 입력 데이터를 소비한다.
      }
    }
  }

}









