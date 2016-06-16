package step05;

public class Array4 {
  int[] arr;

  // 인스턴스 메서드
  // => 인스턴스의 주소를 받기 위해 파라미터를 선언할 필요가 없다.
  // => 메서드에 내장된 this라는 변수가 있는데,
  //    이 변수에 인스턴스 주소가 자동으로 저장된다.
  // => 단 인스턴스 메서드를 사용하려면, 반드시 메서드 이름 앞에
  //    인스턴스 주소를 줘야 한다. 예) instance1.mix();
  void mix() {
    int index1, index2, temp;
    for (int i = 0; i < this.arr.length; i++) {
      index1 = (int)(Math.random() * this.arr.length);
      index2 = (int)(Math.random() * this.arr.length);
      temp = this.arr[index1];
      this.arr[index1] = this.arr[index2];
      this.arr[index2] = temp;
    }
  }

  void printAll(int keyIndex) {
    for (int i = 0; i < this.arr.length; i++) {
      if (keyIndex >= 0 && i == keyIndex) {
        System.out.printf("[%d] ", this.arr[i]);
      } else {
        System.out.printf("%d ", this.arr[i]);
      }
    }
    System.out.println();
  }

  void initByIndexValue() {
    for (int i = 0; i < this.arr.length; i++) {
      this.arr[i] = i;
    }
  }

  void sort() {
    int temp;
    for (int x = 1; x < this.arr.length; x++) {
      for (int i = 0; i < this.arr.length - x; i++) {
        if (this.arr[i] > this.arr[i+1]) {
          temp = this.arr[i];
          this.arr[i] = this.arr[i+1];
          this.arr[i+1] = temp;
        }
      }
    }
  }
}
