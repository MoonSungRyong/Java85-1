/*문제
1) 국영수 점수를 계산하여 총점과 평균을 구하라
   예) java Test11
출력 예:
총점: 270
평균: 90
*/


public class Test11 {
  public static void main(String[] args) {
    /*
    double[] scores;
    scores = new double[5];
    scores[0] = 60.5;
    scores[1] = 78.9;
    scores[2] = 95;
    */
    double[] scores = {60.5, 78.9, 95};

    double sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += scores[i];
    }

    double aver = sum / 3;

    System.out.printf("총점: %f\n", sum);
    System.out.printf("평균: %f\n", aver);
  }
}
