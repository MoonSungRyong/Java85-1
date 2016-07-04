package designpatterns.factorymethod;

public class Test01 {

  public static void main(String[] args) {
    Car1 tico = new Car1();
    tico.maker = "대우자동차";
    tico.model = "티코";
    tico.cc = 800;
    tico.capacity = 5;
        
    Car1 ks = new Car1();
    ks.maker = "쌍용자동차";
    ks.model = "코란도스포츠";
    ks.cc = 3500;
    ks.capacity = 2;
  }

}
