package designpatterns.iterator.step02;

public class AscIterator {
  String[] arr;
  int index;
  
  public AscIterator(String[] arr) {
    this.arr = arr;
  }
  
  public boolean hasNext() {
    if (index >= arr.length) {
      return false;
    }
    return true;
  }
  
  public String next() {
    return arr[index++];
  }
}








