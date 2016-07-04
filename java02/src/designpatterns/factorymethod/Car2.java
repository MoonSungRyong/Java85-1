package designpatterns.factorymethod;

public class Car2 {
  String maker;
  String model;
  int cc;
  int capacity;
  
  private Car2() {}
  
  // 팩토리 메서드 => 인스턴스를 만들어주는 공장 기능을 하는 메서드
  public static Car2 getInstance(String modelCode) {
    Car2 car = new Car2();
    
    switch (modelCode) {
    case "tc":
      car.maker = "대우자동차";
      car.model = "티코";
      car.cc = 800;
      car.capacity = 5;
      break;
    case "ks":
      car.maker = "쌍용자동차";
      car.model = "코란도스포츠";
      car.cc = 3500;
      car.capacity = 2;
    }
    
    return car;
  }
}






