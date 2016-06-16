// 주제: 사용자 정의 데이터 타입 다루기 - instance 변수
// => 개별적으로 다뤄야 하는 값은 인스턴스 변수로 만든다.

package step05;

public class Exam035 {

  public static void main(String[] args) {
    // 배열 주소를 저장할 메모리를 준비한다.
    // => Array3에 선언된 대로 메모리를 준비한다.
    //    int[] arr;
    // Array3 설계도에 따라 준비된 메모리를 "인스턴스"라 부른다.
    // instance1 변수는 인스턴스 주소를 저장하기 때문에 "레퍼런스"라 부른다.
    Array3 instance1 = new Array3();
    instance1.arr = new int[20];

    Array3 instance2 = new Array3();
    instance2.arr = new int[10];

    Array3.initByIndexValue(instance1);
    Array3.mix(instance1);
    Array3.printAll(instance1, -1);

    Array3.initByIndexValue(instance2);
    Array3.mix(instance2);
    Array3.printAll(instance2, -1);

    Array3.printAll(instance1, -1);
    Array3.printAll(instance2, -1);

  }


}

/*

*/
