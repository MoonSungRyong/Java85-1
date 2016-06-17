// 1단계: 자주 사용할 명령어를 별도의 블록으로 묶어 놓는다.
// => 나중에 필요할 때 마다 사용할 수 있다.
// => 재사용성이 높아진다.
//    => 같은 코드를 다시 작성할 필요가 없다.
//    => 개발 시간이 절약된다.
//    => 개발비 절감
//    => 개발 생산성이 높아진다.
package step05.ex02;

public class Test01 {
  public static void main(String[] args) {
    int no = 1;
    float kor = 95f;
    float eng = 100f;
    float math = 97.5f;

    int bonusScore = 5;
    kor += bonusScore;
    eng += bonusScore;
    math += bonusScore;

    float sum = sum(kor, eng, math);
    float aver = sum / 3;

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }

  static float sum(float kor, float eng, float math) {
    return kor + eng + math;
  }
}

/*
# sum()의 문제점
- 국어, 영어, 수학 점수만 다룰 수 있다.
- 나중에 과목이 추가되면 다시 해당 코드를 변경해야 한다.
- 기능 확장성이 낮다.
*/
