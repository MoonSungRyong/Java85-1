// 주제: 변수 사용 - 정수 리터럴 값 저장
package step02;

public class Exam012 {
  public static void main(String[] args) {
    //1) 4byte 리터럴 값 => 1byte 메모리
    byte b1 = 127; // 메모리에 저장할 수 있다면 예외로 허락한다.
    //byte b2 = 128; // 메모리의 크기를 벗어남! 컴파일 오류 발생!
    //byte b3 = 127L; // 8바이트 리터럴에 대해서는 예외를 허락하지 않는다. 컴파일 오류!

    //2) 4byte 리터럴 값 => 2byte 메모리
    short s1 = 32767; // 메모리에 저장할 수 있다면 예외로 허락한다.
    //short s2 = 32768; // 메모리의 크기를 벗어남! 컴파일 오류 발생!
    //short s3 = 32767L; // 8바이트 리터럴에 대해서는 예외를 허락하지 않는다. 컴파일 오류!

    //3) 8byte 리터럴 값 => 4byte 메모리
    int i1 = Integer.MAX_VALUE;
    //int i2 = Integer.MAX_VALUE + 1L; // 8바이트 값을 저장할 수 없다. 컴파일 오류!
    int i3 = 1;
    //int i4 = 1L; // 1L은 8바이트 리터럴 값이다. 컴파일 오류 발생!
  }
}

/*
*/
