// 주제: 사용자 정의 데이터 타입 다루기 - 메서드 문법
package step05;

public class Exam028 {
  //1) 값을 받고 결과를 리턴하는 메서드
  // => 파라미터(parameter): 외부에서 입력한 값을 받는 변수. 예) a, b
  // => 아규먼트(argument): 메서드를 사용할 때 전달하는 값.
  //    int result = m(10, 20);   예) 10, 20
  // => 리턴 타입: 메서드를 실행한 후 리턴하는 값의 데이터 타입. 예) int
  static int m1(int a, int b) {
    return a + b; // 값을 리턴할 때는 return 명령을 사용한다.
  }

  //2) 값을 받고 결과를 리턴하지 않는 메서드
  static void m2(int a, int b) {
    if (b == 0) {
      return; // 그냥 return을 사용하면, 함수 실행을 즉시 멈추라는 뜻이다.
    }
    System.out.println(a / b);
  }

  //3) 값을 받지 않고 결과를 리턴하는 메서드
  static int m3() { // 값을 받지 않는다고 void를 선언해서는 안된다.
    return 100; // int 타입의 값을 리턴하기로 했으면 반드시 그 타입의 값을 리턴해야 한다.
  }

  //4) 값도 안받고 결과도 리턴하지 않는 메서드
  static void m4() {
    System.out.println("헐....");
  }

  public static void main(String[] args) {
    //1)번 메서드 사용
    int result = m1(10, 20);
    System.out.println(result);

    //2)번 메서드 사용
    m2(5, 2);

    //3)번 메서드 사용
    System.out.println(m3());

    //4)번 메서드 사용
    m4();

    // 용서 받지 못 할 메서드 사용 예
    // => 값을 리턴하지 않는 메서드를 아규먼트 자리에 두어서는 안된다.
    //System.out.println(m4());  // 컴파일 오류!
    // => 리턴 타입과 일치하지 않는 변수에 값을 저장하려 할 때
    //String s = m3(); // 컴파일 오류!
  }

}

/*

*/
