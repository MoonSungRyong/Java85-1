//주제: 표현 가능한 값의 범위 - 정수 값의 표현 범위

public class Exam010 {
  public static void main(String[] args) {
    System.out.println(2147000000);

    // 정수 최대 값 알아내기
    System.out.println(Integer.MAX_VALUE);

    // 정수 최소 값 알아내기
    System.out.println(Integer.MIN_VALUE);

  }
}

/*
# 정수 표현 범위
- 약 -21억 ~ +21억

# 정수를 표현할 수 있는 범위가 제한된 이유
- JVM이 정수 값을 다루기 위해 메모리에 저장할 때
  32비트 메모리를 사용하기 때문이다.

# 메모리 크기(비트 개수)와 값의 범위
1) 1 비트
- on 또는 off : 1 또는 0 : 2가지 상태
- 2개의 수를 표현할 수 있다.

2) 2비트
- 2 * 2 = 4 가지 상태
- 4개의 수를 표현할 수 있다.

3) n비트
- 2^n 개의 수를 표현할 수 있다.
- 음수까지 고려한다면 2로 나누면 된다.













*/
