package designpatterns.iterator.step05;

public class AscIterator extends Iterator {
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








