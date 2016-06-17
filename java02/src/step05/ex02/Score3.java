// 4단계: 메서드를 모아두는 역할에 더하여 데이터 타입의 역할을 추가한다.
// => 단순히 점수 데이터를 저장하는 것 외에 총점과 평균, 학생 번호를
//    추가적으로 다루기 위함.
package step05.ex02;

public class Score3 {
  // 데이터 타입을 정의할 때는
  // 각 데이터 항목은 인스턴스 변수로 선언해야 한다.
  // => 인스턴스 변수는 스태틱 변수와 달리 클래스를 실행할 때 자동으로 준비되지 않는다.
  // => new 명령을 실행할 때 비로서 해당 변수의 메모리가 준비된다.
  int no;
  String name;
  float[] scores;
  float sum;
  float aver;

  // 점수 배열은 스태틱 변수에 저장되어 있지 않기 때문에
  // 이전에서 한 것처럼 파라미터 변수로 따로 받아야 한다.
  // 단 점수를 담은 배열의 주소를 받는 게 아니라,
  // 그 주소를 포함하고 있는 인스턴스 주소를 받도록 한다.
  // => 그리고 계산 결과를 인스턴스 내부 메모리에 저장할 것이기 때문에
  //    따로 리턴하지 않는다.
  static void sum(Score3 instance) {
    for (float score : instance.scores) {
      instance.sum += score;
    }
  }

  static void aver(Score3 instance) {
    instance.aver = instance.sum / instance.scores.length;
  }

  static void addBonus(Score3 instance, float bonus) {
    for (int i = 0; i < instance.scores.length; i++) {
      instance.scores[i] += bonus;
      if (instance.scores[i] > 100f) {  // 가산점 추가했을 때 100점이 넘는다면,
        instance.scores[i] = 100f; // 최대 점수는 100점으로 한다.
      }
    }
  }
}
