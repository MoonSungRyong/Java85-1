// 주제: 리터럴(값) 표현 - 정수를 2진수, 8진수, 10진수, 16진수로 표현하기
package step01;

public class Exam006 {
  public static void main(String[] args) {
    System.out.println(74); // 기본은 10진수
    System.out.println(0112); // 정수가 0으로 시작하면 8진수
    System.out.println(0b1001010); // 0b 또는 0B로 시작하면 2진수
    System.out.println(0B1001010); //
    System.out.println(0x4A); // 0x 또는 0X로 시작하면 16진수. 대소문자 구분안함.
    System.out.println(0x4a); // 0x를 많이 사용. 숫자는 대문자를 주로 사용.
    System.out.println(0X4A);
    System.out.println(0X4a);
    System.out.println(0x004a); // 16진수는 앞에 0이 몇 개 오더라도 상관없다. 
  }
}

/*
*/
