package designpatterns.iterator.step06;

public class OddIterator extends AbstractIterator {
  public OddIterator(String[] arr) {
    this.arr = arr;
    index = 1;
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








