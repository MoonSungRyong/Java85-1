// 주제: 데이터 타입 정의 - 자동차 정보 다루기
// => 자동차 데이터를 저장할 데이터 타입 => Car
// => 다룰 데이터: 모델명, 제조사, cc, 주행거리, 탑승인원, 썬루프여부,
//                   에어콘여부
package step06.ex01;

public class Test01 {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.model = "소나타";
    c1.maker = "현대자동차";
    c1.cc = 1997;
    c1.mileage = 25000;
    c1.capacity = 5;
    c1.sunroof = true;
    c1.aircond = false;

    Car c2 = new Car();
    c2.model = "티코";
    c2.maker = "대우자동차";
    c2.cc = 800;
    c2.mileage = 50000;
    c2.capacity = 5;
    c2.sunroof = false;
    c2.aircond = true;


  }
}

/*
*/
