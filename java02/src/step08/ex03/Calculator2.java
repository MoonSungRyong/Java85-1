package step08.ex03;

public class Calculator2 extends Calculator {
  void multiple(int value) {
    this.result *= value; // Calculator로부터 상속받아 만든 result 변수를 사용한다.
  }
}
