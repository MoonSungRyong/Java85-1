package designpatterns.iterator.step03;

public class Iterator {
  String[] arr;
  int index;
  
  // 서브 클래스들이 반드시 갖고 있어야 할 메서드를 수퍼 클래스에 정의해두면
  // 일종의 메서드의 이름이나 파라미터 타입을 강제하는 효과가 있다.
  public boolean hasNext() {return false;}
  public String next() {return null;}
}
