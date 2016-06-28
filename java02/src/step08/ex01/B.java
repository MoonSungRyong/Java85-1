package step08.ex01;

public class B extends A {
  static int s2;
  int i3;
  /* A 클래스에 작성된 인스턴스 변수 선언 코드가 마치 자기 것인양 사용한다.
  int i1;
  int i2;
  */
}

/* 분석
의미? 
=> B는 A의 역할 및 기능을 확장한다.
실제 동작?
=> B 클래스는 A 클래스의 코드를 자기 것인양 사용할 수 있다.
*/
