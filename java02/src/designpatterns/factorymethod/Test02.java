package designpatterns.factorymethod;

public class Test02 {

  public static void main(String[] args) {
    Car2 tico = Car2.getInstance("tc"); // 공장 메서드를 통해 인스턴스를 간접적으로 생성한다.
    Car2 ks = Car2.getInstance("ks");
    
    System.out.printf("%s,%s,%d,%d\n", tico.maker, tico.model, tico.cc, tico.capacity);
    System.out.printf("%s,%s,%d,%d\n", ks.maker, ks.model, ks.cc, ks.capacity);
  }

}
