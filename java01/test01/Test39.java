/* 문제:
=> 2단부터 8단까지 짝수 구구단을 출력한다.
   1부터 9까지 홀수를 곱한다.
   단, 6단은 1에서 9까지 모든 수를 곱한다.
   
*/
public class Test39 {
  public static void main(String[] args) throws Exception {
    for (int i = 2; i < 9; i += 2) {
      for (int j = 1; j <= 9; j += ((i == 6)?1:2)) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        /* 다음 코드를 넣을 때는 for(초기화문;조건문;증감문)문에서 증감문을 없애라.
        if (i == 6) {
          j++;
        } else {
          j += 2;
        }
        */
      }
    }
  }
}




/**/
