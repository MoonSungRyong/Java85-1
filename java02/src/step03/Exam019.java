// 주제: 연산자 사용 - 비트 논리 연산자
package step03;

public class Exam019 {
  public static void main(String[] args) {
    int i1 = 0b1010;
    int i2 = 0b0011;

    //1) 비트 AND 연산
    int r1 = i1 & i2; // 두 비트가 모두 1일 때 결과는 1이다.
    System.out.println(Integer.toBinaryString(r1)); // => 0010

    //2) 비트 OR 연산
    int r2 = i1 | i2; // 두 비트 중에 한 개의 비트라도 1이면 결과는 1이다.
    System.out.println(Integer.toBinaryString(r2)); // => 1011

    //3) 비트 XOR 연산
    int r3 = i1 ^ i2; // 두 비트가 다르면 1, 같으면 0이다.
    System.out.println(Integer.toBinaryString(r3)); // => 1001

    //활용 예1: 1이 아닌 비트만 알아내기
    System.out.println(Integer.toBinaryString(i1 ^ 0b1111)); // => 0101

    //4) 비트 NOT 연산
    // => 모드 비트를 반대 값으로 바꿀 때 사용한다.
    System.out.println(Integer.toBinaryString(~i1));
  }
}

/*
# 비트 연산자 AND
- 값을 필터링 할 때 사용한다.
- 특정 비트의 값만 추출하고 싶을 때 사용한다.
- 사진 편집 프로그램을 만들 때 색상의 세기를 낮출 때 사용한다.
- 예)
  byte red = 0b1111_1111;
  byte newRed = red & 0b0101_0101;
  => 0101_0101 : 빨강 색상의 세기가 줄어든 것을 알 수 있다.

# 비트 연산자 OR
- 값을 보정할 때 사용한다.
- 특정 비틔 값을 강화하고 싶을 때 사용한다.
- 사진 편집 프로그램에서 특정 색상의 세기를 높일 때 사용한다.
- 예)
  byte red = 0b0101_0011;
  byte newRed = red | 0b0011_0011;
  => 0111_0101 : 빨강 색상의 세기가 높아진 것을 알 수 있다.

# 비트 연산자 Exclusive OR
- 패턴이 다른 비트를 찾아내고 싶을 때 사용한다.

*/
