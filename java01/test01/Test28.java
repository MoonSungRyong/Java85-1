/*문제
1) 구구단 2단부터 9단까지 출력하라!
2) 출력 예:
2 * 1 = 2
2 * 2 = 4
...
2 * 9 = 18
3 * 1 = 3
...
9 * 9 = 81
*/


public class Test28 {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }
  }
}




/**/
