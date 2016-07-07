package designpatterns.iterator.step02;

public class EvenIterator {
  String[] arr;
  int index;
  
  public EvenIterator(String[] arr) {
    this.arr = arr;
    index = 0;
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








