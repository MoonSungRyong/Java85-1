/*문제
1) 반복문을 사용하여 0에서 10까지 1씩 증가한 값을 출력한다.
   동시에 0부터 3씩 증가한 값을 출력한다.
2) 출력 예:
0 - 0
1 - 3
2 - 6
3 - 9
*/


public class Test27 {
  public static void main(String[] args) {
    for (int i = 0, j = 0; i <= 10; i++, j += 3) {
      System.out.printf("%d - %d\n", i, j);
    }
    System.out.println();
  }
}




/**/
