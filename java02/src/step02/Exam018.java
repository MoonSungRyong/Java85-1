// 주제: 변수 사용 - 자바에서 기본으로 제공하는(built-in) 복합 데이터 타입
package step02;

public class Exam018 {
  public static void main(String[] args) {
    String s;
    s = new String("Hello");
    s = new String("world!"); // s에 새 메모리의 주소를 저장한다.
                              // 기존에 저장된 주소는 없어진다.
                              // 즉 Hello라는 문자열이 저장된 메모리는 가비지가 된다.

    System.out.println(s); // <== s 변수에 저장된 메모리의 주소를 넘긴다.
                           // println()에서는 그 주소로 찾아가서 문자열을 출력한다.
  }
}

/*

*/
