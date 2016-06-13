// 주제: 리터럴(값) 표현 - 정수 표현
package step01;

public class Exam004 {
  public static void main(String[] args) {
    //1) 4바이트 크기(int type)의 정수 표현
    System.out.println(20);

    //2) 8바이트 크기(long type)의 정수 표현
    System.out.println(20L); // 대문자를 더 많이 사용
    System.out.println(20l);

    //3) 4바이트 정수와 8바이트 정수 리터럴의 차이?
    //System.out.println(2200000000); // 컴파일 오류! 리터럴 표현 범위 초과 오류!
    System.out.println(2200000000L); // OK!
    // 결론: 숫자 뒤에 L 또는 l을 붙이지 않고는 4바이트 크기를 넘는 정수를
    //       표현할 수 없다.
  }
}

/*
*/
