/*문제
1) 다섯 명의 국영수 점수를 계산하여 총점과 평균을 구하라
   각 학생의 총점과 평균은 배열에 저장하라.
   예) java Test12
출력 예:
0: 총점 270점, 평균 90점
1: 총점 240점, 평균 80점
전체 평균: 85점
*/


public class Test12 {
  public static void main(String[] args) {
    double[][] scores = {
      {60.5, 78.9, 95, 0, 0},
      {90, 85, 99, 0, 0},
      {80, 74, 98, 0, 0},
      {70, 82, 97, 0, 0},
      {60, 88, 96, 0, 0}
    };

    // 값 계산
    /*
    1) 학생 수 만큼 반복문 작성
    2) 국,영,수 반복문 작성
    3) 총점(3번방) 계산
    4) 평균(4번방) 계산
    */
    double allAverSum = 0;
    for (int row = 0; row < scores.length; row++) {
      for (int col = 0; col < 3; col++) {
        scores[row][3] += scores[row][col];
      }
      scores[row][4] = scores[row][3] / 3;
      allAverSum += scores[row][4];
    }

    // 값 출력
    /*
    1) 학생 수 만큼 반복문 작성
    2) 각 학생의 번호, 총점, 평균 출력
    3) 전체 평균 출력
    */
    for (int row = 0; row < scores.length; row++) {
      System.out.printf("%d: 총점 %f점, 평균 %f점\n",
        row, scores[row][3], scores[row][4]);
    }
    System.out.printf("전체 평균: %f점\n", allAverSum / scores.length);
  }
}
