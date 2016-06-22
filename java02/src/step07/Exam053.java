// 주제: 배열과 인스턴스 - 레퍼런스 배열
package step07;

import java.util.*;

public class Exam053 {
  public static void main(String[] args) {
    //1) 레퍼런스 : 인스턴스 주소를 저장
    Board5 b = null; // 인스턴스 주소 저장 전. null ? 주소 변수를 초기화시킬 때 사용.
     //b.title = "제목"; // 실행 오류 발생! => NullPointerException
                      // 인스턴스 주소가 없는 상태에서 인스턴스 변수에 접근할 수 없다.

    b = new Board5(); // 인스턴스를 생성하여 그 주소를 레퍼런스에 담아야 한다.
    b.title = "제목";

    //2) 레퍼런스 배열 : 배열 문법 사용하지 않기
    Board5 b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,
          b10, b11, b12, b13, b14, b15, b16, b17, b18, b19,
          b20, b21, b22, b23, b24, b25, b26, b27, b28, b29;
    // => Board5[] arr = new Board5[30];

    b0 = new Board5(); // => arr[0] = new Board5();
    b1 = new Board5(); // => arr[1] = new Board5();
    b2 = new Board5();
    b3 = new Board5();
    b4 = new Board5();
    b5 = new Board5();
    b6 = new Board5();
    b7 = new Board5();
    b8 = new Board5();
    b9 = new Board5();
    b10 = new Board5();
    //...

    /* 배열
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Board5();
    }
    */


  }
}

/*

*/
