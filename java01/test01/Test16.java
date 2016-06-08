/*문제
1) 두 수의 값을 서로 바꿔라.
2) 데이터 예:
int a = 10, b = 5;
3) 출력 예:
a: 5, b: 10
*/

public class Test16 {
  public static void main(String[] args) {
    int a = 10, b = 5;
    int tmp;

    tmp = a;
    a = b;
    b = tmp;

    System.out.printf("a: %d, b: %d\n", a, b);
  }
}

/**/
