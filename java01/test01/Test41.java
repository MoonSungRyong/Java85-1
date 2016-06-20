/* 문제:
구구단 출력: (알고리즘 개선)
1) 2 ~ 9단 출력
2) 짝수 단은 홀수를 1 ~ 9까지 곱하고
3) 홀수 단은 짝수를 2 ~ 8까지 곱한다.
*/
public class Test41 {
  public static void main(String[] args) throws Exception {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1 + (i % 2); j <= 9; j += 2) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }
  }
}




/**/
