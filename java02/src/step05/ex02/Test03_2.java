// 3단계: 스태틱 변수의 한계 경험
// => 동시에 여러 개의 점수 데이터를 다룰 수 없다.
// => 점수 데이터를 다룰 때마다 스태틱 변수의 배열 주소를 교체하면서
//    순차적으로 실행해야 한다.
//    "카셋트와 테이프의 관계", "DVD플레이어와 DVD의 관계"
package step05.ex02;

public class Test03_2 {
  public static void main(String[] args) {
    int no = 1;

    float[] scoresA = {85f, 92f, 87.3f};
    float[] scoresB = {90f, 80f, 95.4f, 89f, 94f};

    //1) scoresA의 총점 및 평균 출력하기
    // => Scores2.scores 변수에 scoresA 주소를 장착한다.
    Score2.scores = scoresA;
    System.out.printf("총점: %f\n", Score2.sum());
    System.out.printf("평균: %f\n", Score2.aver());
    System.out.println("----------------------------");

    //2) scoresB의 총점 및 평균 출력하기
    // => Scores2.scores에 저장된 배열 주소를 scoresB 주소로 교체한다.
    Score2.scores = scoresB;
    System.out.printf("총점: %f\n", Score2.sum());
    System.out.printf("평균: %f\n", Score2.aver());
  }
}

/*

*/
