/*문제
1) 배열에서 이웃 값과의 차이(절대값)를 모두 더하여 출력하라!
>java Test13
2) 배열 데이터 예:
{1, 2, 4, 7, 11, 9}
3) 출력 예:
합계: 15

4) 사용 도구
Math.abs(값) => 절대값
*/


public class Test13 {
  public static void main(String[] args) {
    int[] list = {1, 2, 4, 7, 11, 9};

    /*
    1) 전체 배열을 반복하여 각 항목의 값을 출력한다.
    2) 현재 항목의 값에서 다음 항목의 값을 뺀다. 그 값을 출력한다.
    3) 배열 반복 오류를 잡는다.
    4) 두 항목의 차이를 절대 값으로 출력한다.
    5) 두 항목의 차이를 메모리에 저장한다. 그리고 차이의 합계를 출력한다.
    */

    int totalNum = 0;
    for (int i = 0; i < list.length - 1; i++) {
      totalNum += Math.abs(list[i] - list[i+1]);
    }
    System.out.println(totalNum);
  }
}
