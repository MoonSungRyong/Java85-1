/* 문제:
*/
public class Test43 {
  public static void main(String[] args) throws Exception {
    int i = 2, j = 1;
    while (i <= 9) {
      if (i % 3 == 0) {
        i++;
        continue;
      }
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
