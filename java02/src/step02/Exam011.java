// 주제: 변수 사용 - 자바 기본 데이터 형(primitive data type)
package step02;

public class Exam011 {
  public static void main(String[] args) {
    //1) 정수 메모리 종류
    byte b;   // 1byte : -128 ~ +127
    short s;  // 2byte : -32768 ~ +32767
    int i;    // 4byte : 약 -21억 ~ +21억
    long l;   // 8byte : 약 -900경 ~ +900경

    //2) 부동소수점 메모리 종류
    float f;    // 4byte : 유효자릿수 7자리
    double d;   // 8byte : 유효자릿수 15자리

    //3) 논리 메모리 종류
    boolean bool;   // JVM에서 int로 취급한다. 배열일 경우 byte로 취급한다.

    //4) 문자 메모리 종류
    char c;     // 2byte : 0 ~ 65535 유니코드 값

  }
}

/*
*/
