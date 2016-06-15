// 주제: 사용자 정의 데이터 타입 다루기 - 메서드들을 분류하는 문법 "클래스"
// => 배열과 관련된 메서드들을 별도의 클래스로 분리하여 모아둔다.
// => 이 클래스 뿐만아니라 다른 클래스에서도 배열 관련 메서드를 사용할 수 있다.
// => 소스 디렉토리와 .class 디렉토리가 분리된 상태에서는
//    다른 클래스를 사용하는 클래스를 컴파일할 때
//    -sourcepath 옵션을 붙여야 한다.
// > javac -encoding UTF-8 -d bin -sourcepath src src/step05/Exam031.java
package step05;

public class Exam031 {

  public static void main(String[] args) {
    int[] arr = new int[20];

    // 다른 클래스에 분류된 메서드를 사용하는 경우
    // 그 클래스의 이름을 앞에 명시해야 한다.
    Array.initByIndexValue(arr);
    Array.mix(arr);
    Array.printAll(arr, -1);

    Array.mix(arr); // 언제든 필요할 때 마다 mix()에 선언된 명령을 재 실행할 수 있다.
    Array.printAll(arr, -1); // 이것이 메서드를 만드는 이유다!
  }


}

/*

*/
