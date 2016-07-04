package designpatterns.factorymethod;

public class Car3 {
  // 여러 인스턴스에서 공통으로 사용할 값은 static으로 선언하라!
  // => 이 변수는 참조용으로만 사용할 것이기 때문에 값을 바꾸지 못하게 하라!
  final static String TICO = "tc";
  final static String KORANDO_SPORTS = "ks";
  
  String maker;
  String model;
  int cc;
  int capacity;
  
  private Car3() {}
  
  public static Car3 getInstance(String modelCode) {
    Car3 car = new Car3();
    
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






