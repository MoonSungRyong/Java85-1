// 주제: 사용자 정의 데이터 타입 다루기 - instance 메서드
package step05;

public class Exam036 {

  public static void main(String[] args) {
    Array4 instance1 = new Array4();
    instance1.arr = new int[20];
    Array4 instance2 = new Array4();
    instance2.arr = new int[10];

    instance1.initByIndexValue();
    instance1.mix();
    instance1.printAll(-1);

    instance2.initByIndexValue();
    instance2.mix();
    instance2.printAll(-1);

    instance1.printAll(-1);
    instance2.printAll(-1);

  }


}

/*

*/
