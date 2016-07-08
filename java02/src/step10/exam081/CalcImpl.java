// 주제: 인터페이스 구현
package step10.exam081;

// => 인터페이스를 구현하는 메서드는 반드시 인터페이스에 선언된 모든 메서드를 만들어야 한다.
// => 단 한개의 메서드라도 구현하지 않으면 해당 클래스는 abstract로 선언해야 한다.
//    왜? abstract 메서드는 abstract 클래스만이 가질 수 있다.
//
public class CalcImpl implements Calc {
  
  // 인터페이스의 메서드를 구현할 때 규칙
  //1) public 이어야 한다.
  //2) 리턴타입이 같아야 한다.
  //3) 메서드명이 같아야 한다.
  //4) 파라미터 타입 및 개수가 같아야 한다.
  //5) 파라미터 변수 이름은 상관없다.
  @Override
  public int plus(int v1, int v2) {
    return v1 + v2;
  };
  
  @Override
  public int minus(int a, int b) {
    return a - b;
  }

}
