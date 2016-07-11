package designpatterns.iterator.step06;

// 수퍼 클래스 "AbstractIterator"가 이미 "Iterator" 인터페이스를 구현한다고 했기 때문에
// 이 서브 클래스도 자동으로 "Iterator"를 구현하는 것이 된다.
// => 그래서 수퍼 클래스 "AbstractIterator"가 오버라이딩 하지 않은 
//    Iterator의 추상 메서드를 여기서 구현해야 한다.
public class AscIterator extends AbstractIterator {
  public AscIterator(String[] arr) {
    this.arr = arr;
  }
  
  @Override
  public boolean hasNext() {
    if (index >= arr.length) {
      return false;
    }
    return true;
  }
  
  @Override
  public String next() {
    return arr[index++];
  }
}








