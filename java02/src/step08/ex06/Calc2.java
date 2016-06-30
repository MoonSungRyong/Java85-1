package step08.ex06;

public class Calc2 extends Calc {
  void plusArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      this.result += arr[i];
    }
  }
  
  void plusTwin(int a, int b) {
    this.result += a;
    this.result += b;
  }
}
