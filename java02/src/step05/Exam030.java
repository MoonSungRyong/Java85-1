// 주제: 사용자 정의 데이터 타입 다루기 - static 메서드
// 메서드 용도
// => 명령어를 묶어 놓는 용도
// => 자주 사용할 명령어를 메서드라는 별도의 블록으로 묶어두면
//    필요할 때 마다 재사용할 수 있다.
//    => 매번 똑 같은 코드를 반복해서 칠 필요가 없다.
package step05;

public class Exam030 {

  public static void main(String[] args) {
    int[] arr = new int[20];

    initByIndexValue(arr);
    mix(arr);
    printAll(arr, -1);

    mix(arr); // 언제든 필요할 때 마다 mix()에 선언된 명령을 재 실행할 수 있다.
    printAll(arr, -1); // 이것이 메서드를 만드는 이유다!
  }

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

  static void sort(int[] arr) {
    int temp;
    for (int x = 1; x < arr.length; x++) {
      for (int i = 0; i < arr.length - x; i++) {
        if (arr[i] > arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }
  }
}

/*

*/
