//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 위치(index) 지정

public class Exam028 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[3];

    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;

    // 만약 배열 크기를 벗어나는 위치를 지정한다면?
    scores[3] = 70; // 컴파일 오류가 아니라 실행 오류이다.

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
  }
}

/*






*/
