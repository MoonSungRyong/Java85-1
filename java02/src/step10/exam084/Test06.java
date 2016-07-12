/* 주제 : 이너 클래스 사용법 - inner class 상수 대신 직접 클래스 상수 사용하기
 * => 계층적인 구조로 상수 값을 관리할 수 없어서 읽고 쓰기 불편하다.
 */
package step10.exam084;

import java.util.Scanner;

public class Test06 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int value = Integer.parseInt(keyScan.nextLine());
    
    switch (value) {
    case Subject2.C:
      System.out.println("C 언어를 신청하셨습니다.");
      break;
    case Subject2.ENGLISH:
      System.out.println("영어를 신청하셨습니다.");
      break;
    } 
    keyScan.close();
    
  }
}





