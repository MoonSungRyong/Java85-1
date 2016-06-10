/*문제
1) 학생의 평균 점수를 담은 정수 배열이 있다.
  - 점수에 해당하는 만큼 10당 한 개의 * 문자를 출력하라.
  - String[] names = {"홍길동","임꺽정","유관순","이순신","안중근",
                      "윤봉길","신채호","김구","김원봉","안창호"}
  - int[] scores = {95, 87, 91, 100, 56, 43, 67, 93, 82, 77}
2) 실행 및 출력 예:
>java Test34
홍길동: *********
임꺽정: ********
유관순: *********
이순신: **********
...
*/


public class Test34 {
  public static void main(String[] args) throws Exception {
    String[] names = {"홍길동","임꺽정","유관순","이순신","안중근",
                        "윤봉길","신채호","김  구","김원봉","안창호"};
    int[] scores = {95, 87, 91, 100, 56, 43, 67, 93, 82, 77};

    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s: ", names[i]);
      //별을 찍고,
      for (int j = 0; j < scores[i] / 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}




/**/
