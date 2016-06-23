/* 문제:
수를 입력하세요? 47
홀수입니다.
수를 입력하세요? 30
짝수입니다.
수를 입력하세요? -10
(프로그램 종료)
*/
import java.util.Scanner;

public class Test45 {
  public static void main(String[] args) throws Exception {
    Scanner keyScanner = new Scanner(System.in);

    while (true) {
      System.out.print("수를 입력하세요? ");
      int num = Integer.parseInt(keyScanner.nextLine());
      if (num < 0) {
        break;
      } else if (num % 2 == 0) {
        System.out.println("짝수입니다.");
      } else {
        System.out.println("홀수입니다.");
      }
    }
  }
}




/**/
