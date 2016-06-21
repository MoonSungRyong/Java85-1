// 주제: 생성자 - 기본 생성자가 없고 파라미터를 받는 생성자만 있는 경우
package step07;

public class Exam047 {
  public static void main(String[] args) {
    Board6 b1 = new Board6(); // Board6에는 기본 생성자가 없기 때문에 컴파일 오류!
    b1.printInfo();

    // java.util 패키지의 Date 클래스는 기본 생성자가 있기 때문에
    // 다음과 같이 기본생성자를 호출할 수 있다.
    java.util.Date today = new java.util.Date(); // OK!

    //java.sql.Date today2 = new java.sql.Date(); // 컴파일 오류!
  }
}

/*
*/
