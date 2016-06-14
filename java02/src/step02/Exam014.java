// 주제: 변수 사용 - 다른 타입끼리의 연산 결과
package step02;

public class Exam014 {
  public static void main(String[] args) {
    byte b = 10;
    short s = 20;
    char c = 44032;
    int i = 30;
    long l = 40;
    float f = 50f;
    double d = 60.0;

    //1) byte + short => int + int => int
    //short s2 = b + s; // 컴파일 오류!

    //2) char + byte => int + int => int
    //char c2 = c + b; // 컴파일 오류!

    //3) int + long => long + long => long
    //int i2 = i + l; // 컴파일 오류!

    //4) int + float => float + float => float
    //int i3 = i + f; // 컴파일 오류!

    //5) long + float => float + float => float
    //long l2 = l + f; // 컴파일 오류!

    //6) float + double => double + double => double
    //float f2 = f + d; // 컴파일 오류!

  }
}

/*
# 암시적 형변환(implicit type conversion)
- 다른 타입끼리 연산을 하려 할 때 JVM은 같은 타입으로 만든 다음
  연산을 수행한다. 이것을 암시적 형변환이라고 한다.
- 실제 기존의 변수의 타입을 바꾸는 것이 아니라,
  임시 메모리를 만들어 사용한다.
- 형변환 규칙
  => byte, short, char => int => long => float => double
  => 즉, 왼쪽 타입의 값이 오른 쪽 타입의 값과 연산할 때
     오른쪽 타입의 값을 자동 변환된다.(강조! 임시 메모리가 만들어진다는 뜻이다.)
- boolean은 연산을 할 수 없다.
*/
