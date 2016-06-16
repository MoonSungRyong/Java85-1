// 연습: 4단계 - instance 변수 적용(계속)
// => static 변수 대신 값을 개별적으로 유지할 수 있는 인스턴스 변수를 선언한다.

package step05.ex01;

public class Test04_2 {
  public static void main(String[] args) {
    // 계산A: 3 - 5 + 7 + 2 = ?
    // 계산B: 7 + 3 - 2 - 1 = ?

    // 계산A의 결과를 저장할 메모리를 준비한다.
    Calc3 calcA = new Calc3(); // <== Calc3에 변수 선언된 대로 메모리를 준비하라!
                               //     이때 변수는 static이 붙지 않은 변수를 말한다.
                               //     이렇게 new 명령을 통해 준비되는 변수를
                               //     "인스턴스 변수" 라고 부른다.
                               //     new 명령을 통해 준비한 메모리를 통칭하여
                               //     "인스턴스"라고 부른다.

    // 계산B의 결과를 저장할 메모리를 준비한다.
    Calc3 calcB = new Calc3();

    // 메서드를 호출할 때 result가 들어 있는 인스턴스의 주소를 알려준다.
    Calc3.plus(calcA, 3);
    Calc3.plus(calcB, 7);
    Calc3.minus(calcA, 5);
    Calc3.plus(calcB, 3);
    Calc3.plus(calcA, 7);
    Calc3.minus(calcB, 2);
    Calc3.plus(calcA, 2);
    Calc3.minus(calcB, 1);
    System.out.println(calcA.result);
    System.out.println(calcB.result);
  }
}

/*
# 인스턴스
- 사용자가 정의한 데이터 타입의 메모리를 가리키는 용어다.
- Heap 영역에 준비시킨 메모리를 가리킬 때 주로 사용한다.
- 보통 new 연산자를 이용하여 메모리를 준비시킨다.
- primitive data type(byte, short, int, long, float, double, boolean, char)의
  메모리에 대해서는 이 용어를 잘 사용하지 않는다.

*/
