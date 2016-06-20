// 주제: JVM 메모리 영역 - JVM이 관리하는 메모리 영역과 변수3
// => 외부 클래스의 변수
package step06;

public class Exam040 {
  static int s1 = 10;
  static int s2 = Other1.v1;
  int i1 = 100;

  public static void main(String[] args) {
    int l1 = 100;
    int l2 = 200;

    Exam040 r1 = new Exam040();
    Exam040 r2 = new Exam040();
    r1.i1 = Other1.v2;
    r2.i1 = Other1.v1;
  }
}

/*

*/
