// 주제: 생성자 - 파라미터가 있는 생성자
package step07;

public class Exam045 {
  public static void main(String[] args) {
    Board4 b1 = new Board4(); // 기본 생성자를 이용하여 인스턴스 변수를 초기화시킨다.
    b1.contents = "내용입니다";
    b1.writer = "홍길동";
    b1.printInfo();
    // 메서드 호출에 대한 표현
    // 1) b1 인스턴스에 대해 printInfo() 명령을 수행하라.
    // 2) b1 데이터에 대해 printInfo() 연산을 수행하라.
    // 3) b1 객체에 printInfo() 메시지를 보낸다.

    System.out.println("-------------------------------");

    // 기본 생성자 대신 다른 생성자를 지정한다.
    // => 문자열 값을 세 개 받는 생성자 호출!
    Board4 b2 = new Board4("우헤헤", "내용이래요", "마이아파");
    b2.printInfo();

    // 존재하지 않는 생성자를 지정하면, 컴파일 오류 발생!
    //Board4 b3 = new Board4(1, "제목");


  }
}

/*
*/
