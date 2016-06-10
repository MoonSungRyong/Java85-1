/*다른 프로그램에서 사용할 배열 관련 도구들을 모아둔 도구함*/

public class Array {
  static void mix(int[] arr) {
    int index1, index2, temp;
    for (int i = 0; i < arr.length; i++) {
      index1 = (int)(Math.random() * arr.length);
      index2 = (int)(Math.random() * arr.length);
      temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
    }
  }

  static void printAll(int[] arr, int keyIndex) {
    for (int i = 0; i < arr.length; i++) {
      if (keyIndex >= 0 && i == keyIndex) {
        System.out.printf("[%d] ", arr[i]);
      } else {
        System.out.printf("%d ", arr[i]);
      }
    }
    System.out.println();
  }

  static void initByIndexValue(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
  }
}




/**/
