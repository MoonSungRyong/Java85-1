// 주제: 사용자 정의 데이터 타입 다루기 - static 변수의 한계
// => 다른 값을 다루려면 변수의 값을 매번 교체해야 한다.

package step05;

public class Exam033 {

  public static void main(String[] args) {
    // static 변수는 개별적으로 여러 개의 배열을 관리할 수 없다.
    Array2.arr = new int[20];
    // 아래 메서드들은 오로지 현재 arr에 들어 있는 배열만을 다룬다.
    Array2.initByIndexValue();
    Array2.mix();
    Array2.printAll(-1);

    // 만약 다른 배열을 다루고 싶다면 기존의 값을 새 배열로 바꿔야 한다.
    Array2.arr = new int[10];
    // => 문제는 기존의 배열 주소는 잃어버린다.
    Array2.initByIndexValue();
    Array2.mix();
    Array2.printAll(-1);
    System.out.println("-------------------------------");

    // 기존 배열을 다시 출력하고 싶다!
    // => 안타깝게도 새 배열 주소를 저장하는 바람에 기존 배열 주소를
    //    잃어버려서 다시 출력할 수 없다.

    // 해결책?
    // Array2 바깥쪽에서 배열의 주소를 별도로 보관해야 한다.
    // => Exam034.java 참조



  }


}

/*

*/
