package designpatterns.iterator.step02;

public class DescIterator {
  String[] arr;
  int index;
  
  public DescIterator(String[] arr) {
    this.arr = arr;
    index = arr.length - 1;
  }
  
  public boolean hasNext() {
    if (index < 0) {
      return false;
    }
    return true;
  }
  
  public String next() {
    return arr[index--];
  }
}








