//주제: 같은 종류의 메모리를 여러 개 다루는 방법 - 배열 생성과 초기화

public class Exam030 {
  public static void main(String[] args) {
    int[] scores;

    // 배열 메모리를 생성하는 동시에 값을 초기화시킬 수 있다.
    // => 배열의 갯수는 초기화시키는 값의 개수와 같다.
    // 방법1)
    scores = new int[]{100, 90, 80};
    System.out.println(scores[1]);

    // 방법2)
    // => new int[] 문장을 생략할 수 있다.
    //    단 배열 변수 선언과 함께 넣어야 한다.
    int[] scores2 = {80, 70, 60};

    /* 다음과 같이 배열 변수 선언을 한 후에는 생략할 수 없다.
    int[] scores2;
    scores2 = {80, 70, 60};
    */
    System.out.println(scores2[1]);
  }
}

/*






*/
