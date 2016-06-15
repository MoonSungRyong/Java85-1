// 주제: 연산자 사용 - 비트 이동 연산자
package step03;

public class Exam021 {
  public static void main(String[] args) {
    //1) << : 왼쪽으로 비트 이동
    // => 오른쪽 빈자리는 0으로 채운다.
    int i = 0b00000110; // 6
    System.out.println(i << 1); // 00001100(12) = 6 * 2**1
    System.out.println(i << 2); // 00011000(24) = 6 * 2**2
    System.out.println(i << 3); // 00110000(48) = 6 * 2**3
    System.out.println(i << 4); // 01100000(96) = 6 * 2**4
    System.out.println("--------------------------------");

    //2) >> : 오른쪽으로 비트 이동
    // => 왼쪽 빈 자리는 부호비트로 채운다. 양수이면 0, 음수이면 1로 채운다.
    i = 0b01100101; // 101(10진수)
    System.out.println(i >> 1); // 00110010|1    (50) = 101 / 2**1
    System.out.println(i >> 2); // 00011001|01   (25) = 101 / 2**2
    System.out.println(i >> 3); // 00001100|101  (12) = 101 / 2**3
    System.out.println(i >> 4); // 00000110|0101 (6)  = 101 / 2**4
    System.out.println("--------------------------------");
    
    //3) >>> : 오른쪽으로 비트 이동
    // => 왼쪽 빈 자리는 음수, 양수 상관없이 무조건 0으로 채운다.
    i = -100;
    System.out.println(i >> 1);   // 결과는 음수이다.
    System.out.println(i >>> 1);  // 결과는 양수이다.
  }

}

/*

*/
