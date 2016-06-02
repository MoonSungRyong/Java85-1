//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열에 값 저장

public class Exam027 {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[3];

    // 배열 메모리에 값을 저장하고 싶을 때는 대괄호를 사용하여 메모리의 위치를 지정한다.
    // 위치는 0부터 시작한다.
    // 배열 개수 3개 => 0 ~ 2
    scores[0] = 100;
    scores[1] = 90;
    scores[2] = 80;

    System.out.println(scores[0]);
    System.out.println(scores[1]);
    System.out.println(scores[2]);
  }
}

/*






*/
