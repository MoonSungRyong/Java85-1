// 주제: 사용자 정의 데이터 타입 다루기 - static 변수의 한계 극복
// => 클래스 외부에 백업 변수를 두어 여러 개의 값을 교체하면서
//    값을 다룰 수 있다. 

package step05;

public class Exam034 {

  public static void main(String[] args) {
    Array2.arr = new int[20];
    Array2.initByIndexValue();
    Array2.mix();
    Array2.printAll(-1);

    // 새 배열을 담기 전에 기존 배열의 주소를 백업해둔다.
    int[] backup = Array2.arr;

    // 새 배열로 교체한 후 작업을 수행한다.
    Array2.arr = new int[10];
    Array2.initByIndexValue();
    Array2.mix();
    Array2.printAll(-1);

    // 기존의 20개짜리 배열을 다시 출력하자.
    // 배열 교체!
    int[] backup2 = Array2.arr;
    Array2.arr = backup;
    Array2.printAll(-1);

    // 다시 10개짜리 배열을 출력하자!
    // 배열을 교체!
    backup = Array2.arr;
    Array2.arr = backup2;
    Array2.printAll(-1);

  }


}

/*

*/
