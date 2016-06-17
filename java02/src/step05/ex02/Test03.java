// 3단계: 메서드가 공통으로 사용하는 데이터는 클래스 변수(static 변수)에 저장해두자!
// => 메서드를 호출할 때 마다 값을 넘길 필요가 없다.
package step05.ex02;

public class Test03 {
  public static void main(String[] args) {
    int no = 1;

    // 점수를 저장한 배열 주소를 Score 메서드들이 사용할 수 있도록
    // 클래스 안에 저장해두자!
    // => 배열 초기화 문법에서 데이터 타입을 생략하는 경우?
    //    변수 선언과 함께 사용할 수 있다.
    //    변수 선언 앞에 데이터 타입에 대한 정보가 있기 때문이다.
    // => 그러나 다음과 같이 이미 선언된 변수에 대해
    //    배열 초기화 문법을 사용할 때는 데이터 타입을 생략할 수 없다.
    //Score2.scores = {65f, 100f, 77.5f}; // 컴파일 오류!
    Score2.scores = new float[]{65f, 100f, 77.5f}; // 배열 타입을 명시해야 한다.

    int bonusScore = 5;

    // Score 메서드를 호출할 때 점수를 담은 배열을 사용하는데
    // 배열의 주소가 클래스 안에 있기 때문에
    // 따로 아규먼트로 전달할 필요가 없다!
    Score2.addBonus(bonusScore);
    float sum = Score2.sum();
    float aver = Score2.aver();

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }
}

/*

*/
