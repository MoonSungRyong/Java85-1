// 1단계: 자주 사용할 명령어를 별도의 블록으로 묶어 놓는다.
// => sum() 메서드 개선
// => 기타 기능 메서드화
package step05.ex02;

public class Test01_2 {
  public static void main(String[] args) {
    int no = 1;
    // 향후 다른 과목이 추가될 경우를 고려하여 개별 변수가 아닌
    // 배열을 사용하여 점수를 저장한다.
    /*
    float kor = 95f;
    float eng = 100f;
    float math = 97.5f;
    */
    float[] scores = {65f, 100f, 77.5f};

    int bonusScore = 5;
    /*
    kor += bonusScore;
    eng += bonusScore;
    math += bonusScore;
    */
    addBonus(scores, bonusScore);


    // 각각의 과목 점수를 넘기는 대신
    // 과목 점수가 담긴 배열 주소를 넘긴다.
    // float sum = sum(kor, eng, math);
    float sum = sum(scores);

    //float aver = sum / 3;
    float aver = aver(scores);

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }

  // 각각의 과목 점수를 받아서 계산하지 않고
  // 과목 점수가 저장된 배열 주소를 받아서
  // 배열 개수 만큼 반복하면서 합계를 구한다.
  /*
  static float sum(float kor, float eng, float math) {
    return kor + eng + math;
  }*/
  // 이렇게 명령어를 재사용하기 좋게 별도의 블록으로 묶어 놓은 것 => "메서드"
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

/*

*/
