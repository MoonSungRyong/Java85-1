/* 주제: 상속 - 스태틱 변수 */
package step08.ex04;

public class Exam058 {
  public static void main(String[] args) {
    // 스태틱 변수와 인스턴스 변수는 0으로 자동 초기화 된다.
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
    System.out.println("-------------------");
    
    B.m();
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
    
    // var1은 A클래스의 스태틱 변수이다.
    // => 그러나 서브 클래스 이름으로 접근할 수 있다.
    System.out.printf("B.var1 = %d\n", B.var1);
    A.var1 = 1212;
    System.out.printf("B.var1 = %d\n", A.var1);
    
    // 실무에서는 유지보수의 명확성을 위하여,
    // 서브 클래스 이름으로 수퍼 클래스의 스태틱 변수를 사용하지 않는다.
    // 스태틱 변수를 사용할 때는 가능한 정확하게 그 변수가 선언된 클래스 이름을 사용하라!
  }
}









