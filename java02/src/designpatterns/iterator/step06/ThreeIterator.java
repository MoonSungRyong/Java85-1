package designpatterns.iterator.step06;

public class ThreeIterator extends OkIterator implements Iterator {
  public ThreeIterator(String[] arr) {
    super(arr);
  }

  @Override
  public boolean hasNext() {
    return hasMoreElement();
  }

  @Override
  public String next() {
    return next();
  }
  
  
}






