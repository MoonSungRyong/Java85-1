// 3단계: 메서드가 공유하는 값은 스태틱 변수를 사용하여 저장한다.
// => 스태틱 변수는 클래스가 실행될 때 자동으로 준비된다.
//    따로 메모리를 준비하라고 명령을 내릴 필요가 없다.
// => 스태틱 메모리는 JVM이 실행을 끝냈을 때 비로서 사라진다.
package step05.ex02;

public class Score2 {
  // 점수를 저장하고 있는 배열의 주소를 이 클래스에서 보관하도록 한다.
  static float[] scores;

  static float sum() {
    float sum = 0;
    for (float score : /*Score2.*/scores) { // 클래스 변수(스태틱 변수)를 사용할 때는
      sum += score;              // 클래스 이름을 준다.
    }                            // 단 같은 클래스에 소속된 메서드라면
    return sum;                  // 클래스 이름을 생략할 수 있다.
  }

  static float aver() {
    return sum() / scores.length;
  }

  static void addBonus(float bonus) {
    for (int i = 0; i < scores.length; i++) {
      scores[i] += bonus;
      if (scores[i] > 100f) {  // 가산점 추가했을 때 100점이 넘는다면,
        scores[i] = 100f; // 최대 점수는 100점으로 한다.
      }
    }
  }
}
