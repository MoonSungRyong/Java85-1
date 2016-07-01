/* 주제: Object 클래스 - equals() 재정의 
 */
package step09;

public class Exam066_5 /*extends Object*/ {
  public static void main(String[] args) throws Exception {
    A3 r1 = new A3();
    r1.var1 = 200;
    
    A3 r2 = new A3();
    r2.var1 = 200;
    
    if (r1 == r2) {
      System.out.println("r1 == r2");
    }
    
    // A3에서 재정의한 equals() 메서드를 호출한다.
    if (r1.equals(r2)) { 
      System.out.println("r1.equals(r2)");
    }
  }

}







