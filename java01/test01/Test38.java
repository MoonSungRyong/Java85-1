/* 문제:

*/
public class Test38 {
  public static void main(String[] args) throws Exception {
    for (int i = 1; i <= 30; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        continue;
      }
      System.out.println(i);
    }

  }
}




/**/
