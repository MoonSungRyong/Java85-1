/* 주제: String 클래스 - 문자열 연결하기
 */
package step09;

public class Exam067_10 /*extends Object*/ {
  public static void main(String[] args) {
    String s1 = "Hello,";
    String s2 = " world!";
    String s3 = s1.concat(s2);
    System.out.println(s3);
    
    String s4 = s1 + s2; // 두 문자열을 연결한 새 String 인스턴스를 생성한다.
    System.out.println(s4);
    
    String s5 = s1 + 20; // 숫자를 String 인스턴스로 만든 다음 두 문자열을 연결하여 새 String 생성
    System.out.println(s5);
  }

}






