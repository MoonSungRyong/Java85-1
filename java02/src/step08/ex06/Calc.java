package step08.ex06;

public class Calc {
  int result;
  
  void plus(int value) {
    this.result += value;
  }
  
  void minus(int value) {
    this.result -= value;
  }
  
  void multiple(int value) {
    this.result *= value;
  }
  
  void divide(int value) {
    this.result /= value;
  }
}
