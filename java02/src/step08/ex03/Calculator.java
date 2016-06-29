package step08.ex03;

public class Calculator {
  int result;
  
  void print() {
    // 비록 이 메서드에서 인스턴스를 사용하지 않는다 하더라도,
    // 반드시 내장 변수인 this에 유효한 인스턴스 주소가 저장되어 있어야 한다.
    // 만약 주소가 저장되어 있지 않으면 실행 오류이다.
    System.out.println("Hello, world!");
  }
  
  void plus(int value) {
    this.result += value;
  }
  
  void minus(int value) {
    this.result -= value;
  }
}
