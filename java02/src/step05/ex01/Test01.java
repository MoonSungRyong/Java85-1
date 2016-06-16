// 연습: 1단계 - 클래스 적용 전
package step05.ex01;

public class Test01 {
  public static void main(String[] args) {
    // 계산: 3 - 5 + 7 + 2 = ?
    int result = minus(3, 5);
    result = plus(result, 7);
    result = plus(result, 2);
    System.out.println(result);
  }

  static int plus(int a, int b) {
    return a + b;
  }

  static int minus(int a, int b) {
    return a - b;
  }
}
