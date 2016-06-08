/*문제
1) 두 개의 배열이 있다. 한 배열의 값을 다른 배열로 복사하라!
   단 역순으로 복사한다.
2) 배열 데이터 예:
int[] list1 = {1, 2, 4, 7, 11, 9};
int[] list2 = new int[list1.length];
3) 출력 예:
list1: 1, 2, 4, 7, 11, 9
list2: 9, 11, 7, 4, 2, 1

*/


public class Test15 {
  public static void main(String[] args) {
    int[] list1 = {1, 2, 4, 7, 11, 9};
    int[] list2 = new int[list1.length];

    /* 방법1
    for (int i = 0; i < list1.length; i++) {
      list2[(list1.length - 1) - i] = list1[i];
    }
    */
    /* 방법2
    for (int i = 0, j = list1.length - 1; i < list1.length; i++, j--) {
      list2[j] = list1[i];
    }
    */
    // 방법3
    int j = list1.length - 1;
    for (int i = 0; i < list1.length; i++) {
      list2[j--] = list1[i];
    }

    System.out.print("list1 : ");
    for (int i = 0; i < list1.length; i++) {
      System.out.printf("%s%d", (i == 0) ? "" : ", ", list1[i]);
    }
    System.out.println();

    System.out.print("list2 : ");
    for (int i = 0; i < list2.length; i++) {
      System.out.printf("%s%d", (i == 0) ? "" : ", ", list2[i]);
    }
    System.out.println();

  }
}




/**/
