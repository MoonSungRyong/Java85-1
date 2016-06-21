// 주제: 생성자 - 생성자 용도
package step07;

public class Exam044 {
  // Exam044 클래스도 생성자가 존재한다.
  // 다음 컴파일러가 다음과 같은 기본 생성자를 추가할 뿐이다.
  // public Exam044() {} // <== 아무것도 하지 않는 메서드
  
  public static void main(String[] args) {
    Board3 b1 = new Board3(); // <=== Board2의 기본 생성자를 호출하라!
    // 기본 생성자가 초기화시킨 인스턴스 변수는 내비두고,
    // 나머지 변수의 변수의 값을 초기화시키자!
    b1.contents = "내용입니다";
    b1.writer = "홍길동";

    // b1 객체의 인스턴스 변수 값을 출력하자!
    // => b1 레퍼런스가 가리키는 객체
    // => b1 레퍼런스가 가리키는 인스턴스
    // => b1 레퍼런스 변수에 저장된 주소의 인스턴스
    System.out.println(b1.no); // 생성자에서 초기화시킴.
    System.out.println(b1.title); // 생성자에서 초기화시킴.
    System.out.println(b1.contents);
    System.out.println(b1.writer);
    System.out.println(b1.createdDate); // 생성자에서 초기화시킴
    System.out.println(b1.viewCount); // 생성자에서 초기화시킴
    System.out.println(b1.password); // 생성자에서 초기화시킴

  }
}

/*
# 생성자 용도
- 인스턴스 변수를 준비한 후 사용하기 전에 유효한 값으로 초기화시키기 위해.
*/
