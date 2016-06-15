// 역할: 배열과 관련된 기능을 모아두는 것
package step05;

public class Array2 {
  // 스태틱 변수: 클래스가 관리하는 변수
  static int[] arr;

  // 남의 배열의 값을 섞을 것이 아니기 때문에
  // 더이상 파라미터로 배열 주소를 받지 않는다.
  static void mix() {
    int index1, index2, temp;
    for (int i = 0; i < Array2.arr.length; i++) {
      index1 = (int)(Math.random() * Array2.arr.length);
      index2 = (int)(Math.random() * Array2.arr.length);
      temp = Array2.arr[index1];
      Array2.arr[index1] = Array2.arr[index2];
      Array2.arr[index2] = temp;
    }
  }

  static void printAll(int keyIndex) {
    for (int i = 0; i < Array2.arr.length; i++) {
      if (keyIndex >= 0 && i == keyIndex) {
        System.out.printf("[%d] ", Array2.arr[i]);
      } else {
        System.out.printf("%d ", Array2.arr[i]);
      }
    }
    System.out.println();
  }

  static void initByIndexValue() {
    for (int i = 0; i < Array2.arr.length; i++) {
      Array2.arr[i] = i;
    }
  }

  // 메서드가 속해 있는 클래스의 static 변수나 static 메서드를 사용할 때는
  // 클래스를 이름을 생략해도 된다.
  // => 위쪽의 메서드들도 Array2를 생략할 수 있다.
  //    단지 static 메서드에 접근할 때는 클래스 이름을 붙여야 한다는 것을
  //    알려주기 위해 그냥 내비뒀다.
  static void sort() {
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
