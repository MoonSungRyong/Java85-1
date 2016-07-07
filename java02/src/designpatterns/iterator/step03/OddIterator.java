package designpatterns.iterator.step03;

public class OddIterator extends Iterator {
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








