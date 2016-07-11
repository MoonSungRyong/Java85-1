package designpatterns.iterator.step06;

// 임무: 이 클래스를 새 프로젝트에 맞춰 사용해보자!
// => 기존 클래스의 상속을 포기할 필요는 없다.
//    기존 메서드를 변경할 필요가 없다.
// => 대신 새 규칙을 따르자!
//
public class ThirdIterator extends OkIterator implements Iterator {
  int index;
  
  public ThirdIterator(String[] arr) {
    for (String item : arr) {
      list.add(item);
    }
  }
  
  @Override
  public boolean hasMoreElement() {
    if (index >= list.size()) {
      return false;
    }
    return true;
  }
  
  @Override
  public String nextElement() {
    String value = list.get(index);
    index += 3;
    return value;
  }
  
  // 새 규칙에 따라서 그 규칙에 선언된 메서드를 구현해야 하는데
  // 처음부터 모두 새로 작성하지 말고, 기존 코드를 사용하여 작성을 최소화한다.
  @Override
  public boolean hasNext() {
    return hasMoreElement();
  }
  
  @Override
  public String next() {
    return nextElement();
  }
}








