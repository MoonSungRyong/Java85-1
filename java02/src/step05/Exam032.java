// 주제: 사용자 정의 데이터 타입 다루기 - static 변수
// => 클래스에 소속된 변수
// => 변수의 종류
// 1) 로컬 변수(local variables): 메서드에 소속된 변수
//    => 아규먼트 값을 받는 로컬 변수를 "파라미터"라고 부른다.
// 2) 스태틱 변수(static variables): 클래스에 소속된 변수
// 3) 인스턴스 변수(instance variables): 인스턴스에 소속된 변수
//    => new 명령을 통해 준비된다.

package step05;

public class Exam032 {

  public static void main(String[] args) {
    // Array 클래스가 관리하는
    Array2.arr = new int[20];

    // 다른 클래스에 분류된 메서드를 사용하는 경우
    // 그 클래스의 이름을 앞에 명시해야 한다.
    Array2.initByIndexValue();
    Array2.mix();
    Array2.printAll(-1);

    Array2.mix();
    Array2.printAll(-1);
  }


}

/*

*/
