// 주제: JVM 메모리 영역 - 클래스 로딩 시점 확인1
// => 외부 클래스의 변수
package step06;

public class Exam040 {
  static int s1 = 10;
  static int s2 = 20;
  int i1 = 100;

  static {
    System.out.println("Exam040 로딩됨");
  }

  public static void main(String[] args) {
    int l1 = 100;
    int l2 = 200;
    System.out.println("로컬 변수 값 저장 완료!");

    Exam040 r1 = new Exam040();
    Exam040 r2 = new Exam040();
    System.out.println("인스턴스 생성 완료!");

    r1.i1 = Other1.v2;
    r2.i1 = Other1.v1;
    System.out.println("인스턴스 변수에 값 저장 완료!");

    System.out.printf("Exam040.s1 = %d\n", Exam040.s1);
    System.out.printf("Exam040.s2 = %d\n", Exam040.s2);
    System.out.printf("Other1.v1 = %d\n", Other1.v1);
    System.out.printf("Other1.v2 = %d\n", Other1.v2);
    System.out.printf("l1 = %d\n", l1);
    System.out.printf("l2 = %d\n", l2);
    System.out.printf("r1.i1 = %d\n", r1.i1);
    System.out.printf("r2.i1 = %d\n", r2.i1);
  }
}

/*
# 클래스 로딩 시점
- 클래스가 사용되는 시점에 로딩된다.
- 클래스는 단 한 번만 로딩된다.

# static 변수
- 클래스 로딩될 때 준비된다.
- JVM 실행이 끝나면 해제된다.
- Method Area 영역에 준비된다.

# instance 변수
- new 명령을 통해 준비된다.
- 가비지 컬렉터에 의해 해제된다.
- Heap 영역에 준비된다.

# local 변수
- 메서드가 호출될 때 준비된다.
- 메서드 호출이 끝나면 해제된다.
- JVM Stack 영역에 준비된다.
*/
