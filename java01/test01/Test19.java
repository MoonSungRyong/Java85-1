/*문제
1) 분모, 분자 두 개의 배열이 있다. 나눈 계산 결과 중에서 가장 큰 수를 출력하라!
2) 배열 데이터 예:
int[] numerator = {5, 2, 5};
int[] denominator = {6, 3, 4};
3) 출력 예:
결과: 5/4
*/


public class Test19 {
  public static void main(String[] args) {
    int[] numerator = {5, 2, 5, 2};
    int[] denominator = {6, 3, 4, 7};

    // 1) n[maxIndex] / d[maxIndex] < n[i] / d[i]
    // 2) n[maxIndex] * d[i] < n[i] * d[maxIndex]
    // 3) maxIndex = i;

    int maxIndex = 0;
    for (int i = 1; i < numerator.length; i++) {
      if (numerator[maxIndex] * denominator[i] <
          numerator[i] * denominator[maxIndex] ) {
        maxIndex = i;
      }
    }
    System.out.printf("결과: %d/%d\n", numerator[maxIndex], denominator[maxIndex]);

  }

}




/**/
