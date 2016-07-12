/* 주제 : 이너 클래스 사용법 - 멤버 이너 클래스 사용하기2
 * => 바깥 클래스의 멤버 접근하기
 */
package step10.exam084;

public class Test09 {
  String name = "홍길동";
  int age = 30;
  
  class A {
    int value = 200;
    int age = 40;
    
    void print() {
      //System.out.println(Test09.this.name); // 완전한 정식 표현
      System.out.println(name); // 바깥 클래스의 인스턴스 멤버에 자유롭게 접근 가능!
      
      //System.out.println(A.this.value); // 완전한 정식 표현
      //System.out.println(this.value); // print()가 A의 멤버이기 때문에 클래스 이름 생략 가능.
      System.out.println(value);      // print()가 A의 인스턴스 멤버이기 때문에 this까지 생략 가능.
      
      System.out.println(age); // A 인스턴스의 age 변수이다.
      System.out.println(Test09.this.age); // 바깥 쪽 클래스의 변수를 가리킨다.
    }
  }
  public static void main(String[] args) {
    Test09 obj = new Test09();
    A p = obj.new A();
    p.print();
  }
}





