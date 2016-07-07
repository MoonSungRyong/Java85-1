package designpatterns.iterator.step02;

public class OddIterator {
  String[] arr;
  int index;
  
  public OddIterator(String[] arr) {
    this.arr = arr;
    index = 1;
  }
  
  public boolean hasNext() {
    if (index >= arr.length) {
      return false;
    }
    return true;
  }
  
  public String next() {
    String value = arr[index];
    index += 2;
    return value;
  }
}








