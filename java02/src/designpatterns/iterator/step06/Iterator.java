package designpatterns.iterator.step06;

// Test 클래스가 호출할 메서드를 선언한다.
public interface Iterator {
  boolean hasNext();
  String next();
}
