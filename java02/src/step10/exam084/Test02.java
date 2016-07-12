/* 주제 : 이너 클래스 사용법 - top level inner class
 * => 스태틱 변수나 스태틱 메서드처럼 클래스 이름으로 접근 사용 가능
 * => 상수 값을 선언한 작은 크기의 클래스를 만들 때 사용하는 문법이다. 
 */
package step10.exam084;

public class Test02 {
  static class A {
    int value = 100;
    void print() {
      System.out.println(this.value);
    }
  }
  
  public static void main(String[] args) {
    // main()과 A 클래스는 모두 Test02의 스태틱 멤버이다.
    // 따라서 스태틱 멤버끼리는 그냥 사용할 수 있다. 
    // 굳이 클래스 이름을 앞에 적을 필요가 없다.
    // => Test02.A p = new Test02.A();
    A p = new A();
    p.print();
  }
  
  // 인스턴스 멤버
  void m() {
    // 인스턴스 멤버는 스태틱 멤버에 자유롭게 접근할 있다.
    // 인스턴스를 만들기 전에 클래스가 먼저 로딩되어야 하고,
    // 클래스가 로딩될 때 스태틱 멤버들이 준비되기 때문이다.
    // 따라서 인스턴스가 존재한다는 것은 스태틱 멤버가 이미 존재하고 있다는 것을 의미한다.
    A p = new A();
    p.print();
  }

}





