/*문제
1) 두 개의 배열이 있다. 한 배열의 값을 다른 배열로 복사하라!
2) 배열 데이터 예:
int[] list1 = {1, 2, 4, 7, 11, 9};
int[] list2 = new int[list1.length];
3) 출력 예:
list1: 1, 2, 4, 7, 11, 9
list2: 1, 2, 4, 7, 11, 9

*/


public class Test14 {
  public static void main(String[] args) {
    int[] list1 = {1, 2, 4, 7, 11, 9};
    int[] list2 = new int[list1.length];

    /*
    1) list1 배열의 개수 만큼 반복문을 만든다.
    2) list1의 각 항목 값을 list2에 저장한다.
    3) list1 배열의 개수 만큼 반복문을 만든다.
       list1에 들어있는 값을 출력한다.
    4) list2 배열의 개수 만큼 반복문을 만든다.
       list2에 들어있는 값을 출력한다.
    */
    for (int i = 0; i < list1.length; i++) {
      list2[i] = list1[i];
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
