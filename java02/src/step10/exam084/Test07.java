/* 주제 : 이너 클래스 사용법 - inner class 상수 대신 패키지 멤버 클래스의 상수 사용하기
 * => 모든 클래스가 패키지 멤버이기 때문에, 
 *    패키지에 각 클래스의 소스 파일이 넘쳐(?)난다.
 *    => 간단한 상수 값을 다루는 작은 클래스들이 많아진다.
 *    => 패키지의 자바 파일이 많아 진다.
 */
package step10.exam084;

import java.util.Scanner;

public class Test07 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int value = Integer.parseInt(keyScan.nextLine());
    
    switch (value) {
    case Programming.C:
      System.out.println("C 언어를 신청하셨습니다.");
      break;
    case Language.ENGLISH:
      System.out.println("영어를 신청하셨습니다.");
      break;
    } 
    keyScan.close();
    
    /* 이 방식도 계층 구조처럼 상수들이 분류되기 때문에
     * 나름 코드를 읽고 쓰기 쉽다.
     * 그러나 패키지에 작은 클래스 파일들이 너저분하게 넘치는 문제가 발생한다.
     */
  }
}





