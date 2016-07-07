package designpatterns.iterator.step03;

public class DescIterator extends Iterator {
  public DescIterator(String[] arr) {
    this.arr = arr;
    index = arr.length - 1;
  }
  
  @Override
  public boolean hasNext() {
    if (index < 0) {
      return false;
    }
    return true;
  }
  
  @Override
  public String next() {
    return arr[index--];
  }
}








