/* 주제: StringBuffer 클래스 - equals() 
 * => StringBuffer는 equals()를 재정의하지 않았다.
 */
package step09;

public class Exam068_2 /*extends Object*/ {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("hello");
    StringBuffer b2 = new StringBuffer("hello");
    
    if (b1.equals(b2)) { // 결과: false
      System.out.println("b1.equals(b2)");
    }
  }

}











