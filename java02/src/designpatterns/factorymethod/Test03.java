package designpatterns.factorymethod;

public class Test03 {

  public static void main(String[] args) {
    // 자동차의 모델코드를 직접 입력하는 것이 아니라 변수를 이용하여 전달한다.
    Car3 tico = Car3.getInstance(Car3.TICO);  // "tc"
    Car3 ks = Car3.getInstance(Car3.KORANDO_SPORTS); // "ks"
    
    //Car3.TICO = "okok"; // final로 선언된 변수는 값을 바꿀 수 없다.
    
    System.out.printf("%s,%s,%d,%d\n", tico.maker, tico.model, tico.cc, tico.capacity);
    System.out.printf("%s,%s,%d,%d\n", ks.maker, ks.model, ks.cc, ks.capacity);
  }

}
