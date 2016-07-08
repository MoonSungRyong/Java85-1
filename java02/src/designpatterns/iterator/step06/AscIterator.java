package designpatterns.iterator.step06;

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








