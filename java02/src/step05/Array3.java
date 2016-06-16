package step05;

public class Array3 {
  // 인스턴스 변수: 개별적으로 관리되는 메모리
  // => 인스턴스 변수는 new 명령을 통해서만 메모리가 준비된다.
  // => 스태틱 변수는 클래스를 사용할 때 자동으로 준비된다.
  int[] arr;

  // 인스턴스 변수는 그 메모리의 주소를 알아야지 접근할 수 있다.
  // 클래스 이름으로 접근할 수 없다.
  // => 그래서 메서드를 호출할 때 인스턴스의 메모리 주소를 넘겨야 한다.
  // => 메서드에서도 인스턴스 메모리를 주소를 가지고 변수에 접근해야 한다.
  static void mix(Array3 that) {
    int index1, index2, temp;
    for (int i = 0; i < that.arr.length; i++) {
      index1 = (int)(Math.random() * that.arr.length);
      index2 = (int)(Math.random() * that.arr.length);
      temp = that.arr[index1];
      that.arr[index1] = that.arr[index2];
      that.arr[index2] = temp;
    }
  }

  static void printAll(Array3 that, int keyIndex) {
    for (int i = 0; i < that.arr.length; i++) {
      if (keyIndex >= 0 && i == keyIndex) {
        System.out.printf("[%d] ", that.arr[i]);
      } else {
        System.out.printf("%d ", that.arr[i]);
      }
    }
    System.out.println();
  }

  static void initByIndexValue(Array3 that) {
    for (int i = 0; i < that.arr.length; i++) {
      that.arr[i] = i;
    }
  }

  static void sort(Array3 that) {
    int temp;
    for (int x = 1; x < that.arr.length; x++) {
      for (int i = 0; i < that.arr.length - x; i++) {
        if (that.arr[i] > that.arr[i+1]) {
          temp = that.arr[i];
          that.arr[i] = that.arr[i+1];
          that.arr[i+1] = temp;
        }
      }
    }
  }
}
