/* 문제:
=> while 문을 사용하여 구구단 출력
*/
public class Test42 {
  public static void main(String[] args) throws Exception {
    int i = 2, j = 1;
    while (i <= 9) {
      j = 1;
      while (j <= 9) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      i++;
    }
  }
}




/**/
