/* 주제: String 클래스 - Mutable과 Immutable 객체 
 * => Mutable 객체: 값을 바꿀 수 있는 객체
 *    => StringBuffer, StringBuilder
 * => Immutable 객체: 값을 바꿀 수 없는 객체
 *    => String 
 */
package step09;

public class Exam067_5 /*extends Object*/ {
  public static void main(String[] args) {
    //1) Immutable 객체
    // String 클래스는 한 번 값을 저장하면 절대 변경할 수 없는 Immutable 객체이다.
    String s1 = new String("abcdefghijk"); 
    
    //특정 위치의 문자열을 다른 문자열로 대체하기
    String s2 = s1.replace("def", "xoxo");
    System.out.println(s1); // 원래의 s1 객체
    System.out.println(s2); // 새로만든 스트링 객체
    
    //2) Mutable 객체
    // StringBuffer는 값을 변경할 수 있는 Mutable 객체이다.
    StringBuffer sb1 = new StringBuffer("abcdefghijk");
    
    StringBuffer sb2 = sb1.replace(3, 6, "xoxo"); // 리턴 값은 자기 자신의 주소이다.
    if (sb1 == sb2) {
      System.out.println("sb1 == sb2");
    }

    System.out.println(sb1);
  }

}






