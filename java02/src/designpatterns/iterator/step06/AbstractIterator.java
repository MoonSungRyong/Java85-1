package designpatterns.iterator.step06;

public abstract class AbstractIterator implements Iterator {
  // 자식 클래스가 가져야할 공통 변수만 추가하자.
  String[] arr;
  int index;
}
