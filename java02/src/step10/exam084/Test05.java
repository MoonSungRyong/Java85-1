/* 주제 : 이너 클래스 사용법 - inner class 상수 사용하기
 * => 계층적인 구조로 상수 값을 관리하고 사용할 수 있어서 
 *    코드를 작성하고 읽기 쉬워진다.
 */
package step10.exam084;

import java.util.Scanner;

public class Test05 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int value = Integer.parseInt(keyScan.nextLine());
    
    switch (value) {
    case Subject.programming.C:
      System.out.println("C 언어를 신청하셨습니다.");
      break;
    case Subject.language.ENGLISH:
      System.out.println("영어를 신청하셨습니다.");
      break;
    } 
    keyScan.close();
    
    /*
     * programming 은 Subject의 inner class 임에도 불구하고
     * 꼭 프로퍼티처럼 단순하게 표현할 수 있어서 작성하고 읽기 매우 쉽다.
     */
  }
}





