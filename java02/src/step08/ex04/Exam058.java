/* 주제: 상속 - 스태틱 변수 */
package step08.ex02;

public class Exam057 {
  public static void main(String[] args) {
    // 스태틱 변수와 인스턴스 변수는 0으로 자동 초기화 된다.
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
    System.out.println("-------------------");
    
    B.m();
    System.out.printf("A.var1 = %d\n", A.var1);
    System.out.printf("B.var3 = %d\n", B.var3);
    
  }
}









