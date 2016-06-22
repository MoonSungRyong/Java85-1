/* 문제:
다음과 같이 사용자로부터 구구단의 특정 단 값을 입력 받아 구구단을 출력하라!
단 값은 2에서 9까지 유효하다. 만약 그 외의 수를 입력하면,
다시 입력하라고 안내 문구를 출력하고 사용자로부터 다시 입력 받는다.
예)
> java Test44
출력할 구구단? 19
2에서 9까지만 입력하세요.
출력할 구구단? 8
8 * 1 = 8
8 * 2 = 16
...
*/
public class Test44 {
  public static void main(String[] args) throws Exception {
    java.util.Scanner keyScanner = new java.util.Scanner(System.in);

    int num; // 사용하기 전에 값을 저장할 것이기 때문에 초기화가 필요 없다.
    do {
      System.out.print("출력할 구구단?");
      num = Integer.parseInt(keyScanner.nextLine());
      if (num < 2 || num > 9) {
        System.out.println("2에서 9까지만 입력하세요.");
      }
    } while (num < 2 || num > 9);

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", num, i, num * i);
    }
  }
}




/**/
