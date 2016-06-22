/* 문제:
다음과 같이 사용자로부터 구구단의 특정 단 값을 입력 받아 구구단을 출력하라!
예)
> java Test43
출력할 구구단? 8
8 * 1 = 8
8 * 2 = 16
...
*/
public class Test43 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner keyScanner = new java.util.Scanner(System.in);

    System.out.print("출력할 구구단?");
    int num = Integer.parseInt(keyScanner.nextLine());

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", num, i, num * i);
    }
  }
}




/**/
