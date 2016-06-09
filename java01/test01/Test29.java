/*문제
1) 구구단 2단부터 9단까지 출력하라!
   단 5단은 제외한다.
2) 출력 예:
2 * 1 = 2
2 * 2 = 4
...
4 * 9 = 36
6 * 1 = 6
...
9 * 9 = 81
*/


public class Test29 {
  public static void main(String[] args) {
    for (int i = 2; i <= 9; i++) {
      if (i == 5)
        continue;
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }
  }
}




/**/
