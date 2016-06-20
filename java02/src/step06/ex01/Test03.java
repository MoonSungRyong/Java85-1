// 주제: 데이터 타입 정의 - 주문 정보 다루기
// => 주문 데이터를 저장할 타입 : Order
// => 다룰 데이터: 주문번호, 책번호, 주문자아이디, 수량, 주문일, 택배비지불여부
package step06.ex01;

public class Test03 {
  public static void main(String[] args) {
    Order order1; // 레펀런스 선언. 아직 인스턴스는 생성되지 않았다.
    order1 = new Order(); // 인스턴스 생성. 그 주소를 레퍼런스에 저장.
    order1.no = 1;
    order1.bookNo = 100;
    order1.memberId = "hong11";
    order1.quantity = 2;
    order1.isDeliveryPay = true;
    order1.registeredDate = "2016-06-20";
    
  }
}

/*
*/
