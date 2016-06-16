/* 문제:
=> 0부터 20까지 1, 2씩 순환하면서 증가한다.
=> 0 1 3 4 6 7 9 10 12 ...
*/
public class Test38_2 {
  public static void main(String[] args) throws Exception {
    for (int i = 0, x = 1; i <= 20; i += x, x = 3 - x) {
      System.out.println(i);
    }
  }
}




/**/
