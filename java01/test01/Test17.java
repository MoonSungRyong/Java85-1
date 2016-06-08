/*문제
1) 배열을 반으로 나눠서 서로 값을 바꾼다.
   단 배열의 항목은 항상 짝수여야 한다.
2) 배열 데이터 예:
int[] list1 = {1, 2, 4, 7, 11, 9, 30, 3};
3) 출력 예:
list1: 11, 9, 30, 3, 1, 2, 4, 7
*/


public class Test17 {
  public static void main(String[] args) {
    int[] list = {1, 2, 4, 7, 11, 9, 30, 3};
    int tmp;
    int length = list.length / 2;

    for (int i = 0; i < length; i++) {
      tmp = list[length + i];
      list[length + i] = list[i];
      list[i] = tmp;
    }
    System.out.print("배열 :");
    for (int i = 0; i < list.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
      System.out.print(list[i]);
    }
    System.out.println();
  }

}




/**/
