// 주제: 기타 - 사용자로부터 키보드 입력 받기
// 도구 소개
// 1) System.in : 키보드에 입력한 값을 읽어들이는 도구
// 2) Scanner : 특정 형식으로 데이터를 잘라 주는 도구
package step07;

public class Exam048 {
  public static void main(String[] args) {
    java.util.Scanner keyScanner = new java.util.Scanner(System.in);
    String str = keyScanner.nextLine(); // 입력 문자를 줄 단위로 잘라준다.
    System.out.println(str);
  }
}

/*
*/
