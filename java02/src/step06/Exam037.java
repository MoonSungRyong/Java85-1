// 주제: JVM 메모리 영역 - 클래스 실행
package step06;

public class Exam037 {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}

/*
# JVM이 클래스를 실행하는 절차
1) Verification: .class 파일의 유효성 검사
   => 진짜 컴파일러가 생성한 바이트코드가 맞는 지 검사한다.
   => 또한 현재 JVM 버전에서 실행할 수 있는 지 검사한다.
2) Preparation: 정적 자원 준비
   => .class를 실행할 수 있도록 메모리에 올린다.
   => static 필드(변수 및 상수)를 준비하고, 기본 값을 할당한다.
3) Resolution: 이 클래스가 참조하는 다른 클래스 정보 수집
   => 이 클래스가 참조하는 다른 클래스나 인터페이스를 사용할 수 있도록
      정보를 준비한다.
4) main() 메서드를 호출한다.
*/
