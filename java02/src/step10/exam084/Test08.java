/* 주제 : 이너 클래스 사용법 - 멤버 이너 클래스 사용하기
 * => 바깥 클래스의 멤버를 자유롭게 접근하고 싶을 때 사용한다.
 */
package step10.exam084;

public class Test08 {
  class A {
    int value = 200;
    void print() {
      System.out.println(value);
    }
  }
  public static void main(String[] args) {
    // A 클래스는 Test08에서 인스턴스 멤버이다.
    // 인스턴스 멤버는 반드시 인스턴스 주소가 있어야만 접근할 수 있다.
    // 따라서 다음과 같이 인스터스 주소 없이 A클래스를 사용할 수 없다.
    // 단 레퍼런스 선언은 예외다.
    A p;
    //p = new A(); // 컴파일 오류!
    
    //1) Test08 인스턴스 먼저 생성
    Test08 obj = new Test08();
    p = obj.new A();
    p.print();
  }
}





