package step08.ex06;

public class Calc3 extends Calc {
  // 자바는 파라미터 타입이 다르거나 개수가 다르면 같은 이름을 사용할 수 있다.
  // => 물론 같은 기능을 수행하는 메서드끼리 같은 이름을 사용해야 한다.
  // => Calc로부터 상속 받은 메서드의 이름이 plus()이지만,
  //    그 메서드와 파라미터 타입이 다르다. 그러나 기능은 같다.
  //    그래서 메서드 이름을 같게 하였다.
  void plus(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      this.result += arr[i];
    }
  }
  
  void plus(int a, int b) {
    this.result += a;
    this.result += b;
  }
}
