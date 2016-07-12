/* 주제 : 이너 클래스 사용법 - 개요
 * => 특정 클래스에서만 사용할 용도로 선언한 클래스
 * => 클래스 안에 선언한다. 
 */
package step10.exam084;

public class Test01 {
  //1) top level inner class
  //   => 스태틱 변수나 스태틱 메서드처럼 사용한다.
  static class A {}

  //2) member inner class
  //   => 인스턴스 변수나 인스턴스 메서드처럼 인스턴스 주소가 있어야만 사용할 수 있다.
  class B {}
  
  public static void main(String[] args) {
    //3) local inner class
    //   => 메서드 안에서만 사용할 수 있다.
    //   => 로컬 변수처럼 접근 제어 키워드를 갖을 수 없다. 예) public, private, protected
    class C {}
    
    //4) anonymous local inner class
    Object obj = new Object() {};

  }
  
  //5) anonymous member inner class
  Object obj = new Object() {};

}
