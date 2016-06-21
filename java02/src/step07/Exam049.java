// 주제: 기타 - 사용자로부터 키보드 입력 받기2
// => 사용자로부터 이름과 나이 입력 받기
package step07;

public class Exam049 {
  public static void main(String[] args) {
    java.util.Scanner keyScanner = new java.util.Scanner(System.in);
    System.out.print("이름? ");
    String name = keyScanner.nextLine(); // 입력 문자를 줄 단위로 잘라준다.

    System.out.print("나이? ");
    String age = keyScanner.nextLine();

    System.out.printf("%s(%s)\n", name, age);
  }
}

/*
*/
