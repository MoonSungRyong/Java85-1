/* 주제: String 클래스 - String 인스턴스 생성 후 바로 사용하기
 */
package step09;

public class Exam067_7 /*extends Object*/ {
  public static void main(String[] args) {
    String s2 = new String("abcdefghijk").substring(3);
    System.out.println(s2);
    
    String s4 = "abcdefghijk".substring(3);
    System.out.println(s4);
    
    
  }

}






