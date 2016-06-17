// 2단계: 클래스 문법을 사용하여 메서드를 분류한다.
// => 서로 관련된 메서드를 별도의 클래스에 모아두면
//    유지보수하기가 쉬워진다.
package step05.ex02;

public class Test02 {
  public static void main(String[] args) {
    int no = 1;
    float[] scores = {65f, 100f, 77.5f};

    int bonusScore = 5;
    // 다른 클래스에 있는 스태틱 메서드를 호출할 때는
    // 메서드 이름 앞에 클래스 이름을 지정해야 한다.
    Score.addBonus(scores, bonusScore);

    float sum = Score.sum(scores);
    float aver = Score.aver(scores);

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }
}

/*

*/
