package designpatterns.iterator.step05;

public class EvenIterator extends Iterator {
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








