package designpatterns.iterator.step05;

public class ThirdIterator extends OkIterator {
  int index;
  
  public ThirdIterator(String[] arr) {
    for (String item : arr) {
      list.add(item);
    }
  }
  
  @Override
  public boolean hasMoreElement() {
    if (index >= list.size()) {
      return false;
    }
    return true;
  }
  
  @Override
  public String nextElement() {
    String value = list.get(index);
    index += 3;
    return value;
  }
}








