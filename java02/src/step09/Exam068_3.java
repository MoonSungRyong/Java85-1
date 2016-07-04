/* 주제: StringBuffer 클래스 - replace(), delete(), insert()
 * => StringBuffer는 Mutable 객체이다.
 */
package step09;

public class Exam068_3 /*extends Object*/ {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("abcdefghijk");
    StringBuffer b2 = b1.replace(3, 6, "xoxo"); // b1을 리턴한다.
    
    if (b1 == b2) {
      System.out.println("b1 == b2");
    }
    
    System.out.println(b1); // abcxoxoghijk
    
    b1.delete(3, 6);
    System.out.println(b1); // abcoghijk
    
    b1.insert(3, "XXX");  
    System.out.println(b1); // abcXXXoghijk
  }

}











