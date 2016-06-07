/*문제
1) 0 ~ 9까지 숫자를 출력한다.
2) 각 숫자가 홀수인지 짝수인지 출력한다.
출력 예:
0(짝수)
1(홀수)
2(짝수)
...
*/
public class Test01_2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.printf("%d(짝수)\n", i);
      } else {
        System.out.printf("%d(홀수)\n", i);
      }
    }
  }
}
