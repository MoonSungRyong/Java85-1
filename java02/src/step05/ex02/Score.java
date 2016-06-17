// 2단계: 과목 점수의 합계와 평균, 가산점 추가를 수행하는 메서드를
//        관리하기 쉽게 별도의 클래스에 모아 둔다.
package step05.ex02;

public class Score {
  static float sum(float[] scores) {
    float sum = 0;
    for (float score : scores) {
      sum += score;
    }
    return sum;
  }

  static float aver(float[] scores) {
    return sum(scores) / scores.length;
  }

  static void addBonus(float[] scores, float bonus) {
    for (int i = 0; i < scores.length; i++) {
      scores[i] += bonus;
      if (scores[i] > 100f) {  // 가산점 추가했을 때 100점이 넘는다면,
        scores[i] = 100f; // 최대 점수는 100점으로 한다.
      }
    }
  }
}
