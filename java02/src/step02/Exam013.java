// 주제: 변수 사용 - 정수 연산과 데이터 타입
package step02;

public class Exam013 {
  public static void main(String[] args) {
    byte b1 = 10;
    byte b2 = 20;

    //1) 리터럴 끼리의 연산
    // => 리터럴 끼리의 연산 결과는 리터럴이다.
    // => 리터럴 규칙에 따른다.
    byte b3 = 10 + 20; // 리터럴 규칙에 따라 예외로 저장을 허락한다.

    //2) 연산에 변수가 포함된 경우
    // => 자바에서 정수 연산의 최소 단위는 int이다.
    // => 변수가 byte이든 short이든 최소 연산 단위는 int이다.
    //byte b4 = b1 + b2; // byte + byte => int + int => int  컴파일 오류 발생!

    int i1 = b1 + b2; // OK!

    //3) short 형 테스트
    short s1 = 10;
    short s2 = 20;
    short s3 = 10 + 20;

    // 연산에 변수가 포함되어 있으면 리터럴 예외 규칙이 적용되지 않는다.
    //short s4 = s1 + 30; // short + int => int + int => int 컴파일 오류 발생!
    int i2 = s1 + 30;

  }
}

/*
*/
