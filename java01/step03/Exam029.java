//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 변수와 메모리의 관계
//배열 변수: 배열을 가리키는 변수

public class Exam029 {
  public static void main(String[] args) {
    int[] scores; // 배열 메모리를 가리키는 변수

    scores = new int[3];
    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;
    //System.out.println(scores[4]); // 실행 오류! 인덱스가 범위를 벗어났다.

    // scores가 다른 배열 메모리를 가리킨다.
    scores = new int[5];
    scores[0] = 50;
    scores[1] = 20;
    scores[2] = 30;
    scores[3] = 40;
    scores[4] = 50;
    System.out.println(scores[4]); // OK!
  }
}

/*






*/
