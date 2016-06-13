// 주제: 리터럴(값) 표현 - 부동 소수점 표현
package step01;

public class Exam005 {
  public static void main(String[] args) {
    //1) 8바이트 크기(double type)의 부동소수점 표현
    System.out.println(3.14);

    //2) 4바이트 크기(float type)의 부동소수점 표현
    System.out.println(3.14F);
    System.out.println(3.14f); // 소문자를 더 많이 사용

    //3) 4바이트(float)와 8바이트(double) 크기의 차이?
    System.out.println("float:");
    System.out.println(9876.543f);
    System.out.println(9876.54398766532f);
    // 정수의 경우와 달리
    // 4바이트 크기를 넘어가더라도 컴파일 오류가 발생하지 않고
    // 단지 반올림 처리된다.

    System.out.println("double:");
    System.out.println(9876.543);
    System.out.println(9876.54398766532);
    // 8바이트는 4바이트보다 두 배 더 정밀한 값을 표현할 수 있다.
    // 4바이트는 7자리까지 유효하다. 8바이트는 약 2배인 15자리까지 유효하다.
    // 그래서 8바이트 크기를 double 이라고 부른다.
  }
}

/*
*/
