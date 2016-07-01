/* 주제: String 클래스 - intern() : 일반 String 인스턴스의 값을 가지고 상수 스트링 풀에 생성한다.*/
package step09;

public class Exam067_4 /*extends Object*/ {
  public static void main(String[] args) {
    String s1 = new String("hello");
    
    String s2 = s1.intern(); // s1의 문자열을 상수 스트링 풀에 따로 만든다.
    String s3 = "hello"; // 상수 스트링 풀에 String 인스턴스를 생성하라!
                         // 이미 이전에 상수 스트링 풀에 해당 값을 갖는 인스턴스가 존재하고 있다.
    
    if (s2 == s3) {
      System.out.println("s2 == s3");
    }
    
    String s4 = new String("hello");
    String s5 = s4.intern(); //이미 상수 스트링 풀에 해당 값과 같은 인스턴스가 존재하고 있다.
    if (s3 == s5) {
      System.out.println("s3 == s5");
    }
  }

}






