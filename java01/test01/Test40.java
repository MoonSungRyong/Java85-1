/* 문제:
구구단 출력:
1) 2 ~ 9단 출력
2) 짝수 단은 홀수를 1 ~ 9까지 곱하고
3) 홀수 단은 짝수를 2 ~ 8까지 곱한다.
*/
public class Test40 {
  public static void main(String[] args) throws Exception {
    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if ( ((i % 2 == 0) && (j % 2 != 0)) ||
             ((i % 2 != 0) && (j % 2 == 0)) ) {
          System.out.printf("%d * %d = %d\n", i, j, i * j);
        }
      }
    }
  }
}




/**/
