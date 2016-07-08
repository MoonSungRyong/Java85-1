package designpatterns.iterator.step05;

public class OkIterator {
  String[] arr;
  int index;

  public OkIterator(String[] arr) {
    this.arr = arr;
  }
  
  public boolean hasMoreElement() {
    if (index >= arr.length) {
      return false;
    }
    return true;
  }
  
  public String nextElement() {
    String value = arr[index];
    index += 3;
    return value;
  }
}






