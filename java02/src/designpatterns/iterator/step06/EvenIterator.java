package designpatterns.iterator.step06;

public class EvenIterator extends AbstractIterator {
  public EvenIterator(String[] arr) {
    this.arr = arr;
    index = 0;
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
    String value = arr[index];
    index += 2;
    return value;
  }
}








