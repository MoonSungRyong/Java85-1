// 주제: 배열과 인스턴스 - 레퍼런스 배열2
package step07;

import java.util.*;

public class Exam054 {
  public static void main(String[] args) {
    //배열을 가리키는 레퍼런스 : 배열 주소를 저장
    Board5[] arr = null; // 주소 변수는 null로 초기화시킨다.

    // 용서 받지 못할 코드
    // 1) 인스턴스 주소를 저장하지 않고 사용하기
    // => arr 레퍼런스에는 어떤 주소도 저장되어 있지 않다.
    //arr[0].title = "제목";

    // 2) 배열을 만들어 그 배열의 주소를 저장했지만,
    //    배열 항목에 주소가 없는 경우
    // => 클래스 배열은 객체 배열이 아니라 레퍼런스 배열이기 때문이다.
    // => arr에는 배열의 주소가 들어 있다.
    // => arr[0]에 주소가 들어 있지 않다.
    // => 강조! arr[0]은 객체가 아니라 주소를 저장하는 방이다.
    arr = new Board5[5]; // Board5 인스턴스의 주소를 저장할 방(레퍼런스)을 5개 만들라!
                        // => Board5 b0, b1, b2, b3, b4;
    // => 0번 방에 Board5 인스턴스 주소가 저장되지 않았는데
    //    인스턴스 변수를 사용하려 한다. => 실행 오류!
    //arr[0].title = "제목";

    // 올바른 사용법!
    // => 레퍼런스 배열에 인스턴스 주소를 저장한 후 사용하라!
    arr[0] = new Board5();
    arr[1] = new Board5();
    arr[2] = new Board5();
    arr[3] = new Board5();
    arr[4] = new Board5();

    // => 이제서야 레퍼런스 배열을 이용하여 값을 인스턴스에 저장할 수 있다.
    arr[0].title = "제목";
    arr[1].title = "제목2";
    arr[2].title = "제목3";
    arr[3].title = "제목4";
    arr[4].title = "제목5";


  }
}

/*

*/
