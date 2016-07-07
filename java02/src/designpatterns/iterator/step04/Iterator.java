package designpatterns.iterator.step04;

abstract public class Iterator {
  String[] arr;
  int index;

  // 서브 클래스에서 무조건 오버라이딩 하도록 강제하는 방법
  // => 추상 메서드로 선언한다.
  // => 추상 메서드는 몸체를 가질 수 없다.
  abstract public boolean hasNext();
  abstract public String next();
}
