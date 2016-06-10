/*문제
1) 학생의 평균 점수를 담은 정수 배열이 있다.
  - 점수에 따라 A ~ F까지 숫자를 부여하라.
    기준:
    90 <= 점수         : A
    80 <= 점수 < 90    : B
    70 <= 점수 < 80    : C
    60 <= 점수 < 70    : D
    60 > 점수          : F
  - String[] names = {"홍길동","임꺽정","유관순","이순신","안중근",
                      "윤봉길","신채호","김구","김원봉","안창호"}
  - int[] scores = {95, 87, 91, 100, 56, 43, 67, 93, 82, 77}
2) 실행 및 출력 예:
>java Test34
홍길동: A
임꺽정: B
유관순: A
이순신: A
...
*/


public class Test35 {
  public static void main(String[] args) throws Exception {
    for (int i = 2; i <= 9; i++) {
      if (i == 5 || i == 7) {
        continue;
      }
      for (int j = 1; j <= 9; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
    }
  }
}




/**/
