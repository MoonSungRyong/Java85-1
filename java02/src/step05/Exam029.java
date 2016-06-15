// 주제: 사용자 정의 데이터 타입 다루기 - call by value, call by reference
package step05;

public class Exam029 {
  //1) call by value : 메서드를 실행할 때 값을 넘긴다.
  static void m(int a) {
    a = 20;
  }

  //2) call by reference : 메서드를 실행할 때 주소를 넘긴다.
  static void m2(int[] arr) {
    arr[0] = 100;
    arr[1] = 90;
    arr[2] = 80;
  }

  public static void main(String[] args) {
    //1) call by value 예
    int a = 10;
    m(a); // 메서드를 호출할 때 값을 넘긴다. => call by value
    System.out.println(a);
    System.out.println("-------------------------------");

    //2) call by referece 예
    int[] arr = {0, 0, 0};
    m2(arr); // m2() 호출할 때 배열의 주소를 넘긴다. => call by reference
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

  }


}

/*

*/
