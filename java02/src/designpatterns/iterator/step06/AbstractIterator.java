package designpatterns.iterator.step06;

// Iterator 구현체(Iterator 인터페이스에 따라 만든 클래스)들이 공통으로 가져야할
// 변수나 메서드를 이 클래스에서 선언한다.
// Iterator 인터페이스를 구현한다.
abstract public class AbstractIterator implements Iterator {
  String[] arr;
  int index;
  
  // 어? Iterator 인터페이스를 구현한다는 것은 
  // 그 인터페이스에 선언된 모든 메서드를 오버라이딩 해야 한다는 것 아닌가요?
  // => 이 클래스는 서브 클래스에 공통 변수/메서드를 상속해주는 용도이다.
  // => 어차피 서브 클래스에서 hasNext()와 next()를 구현해야 한다.
  // => 따라서 그냥 추상 메서드로 남겨두는 것이 좋다.
  // => 인터페이스의 메서드를 오버라이딩 하지 않으면 그냥 추상 메서드인채로 존재한다.
}
