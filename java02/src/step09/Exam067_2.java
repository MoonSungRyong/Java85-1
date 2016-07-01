/* 주제: String 클래스 - String 클래스 사용
 * => String 클래스는 문자열을 저장하기 위해서 char[] 배열을 사용한다.
 *    즉 String 인스턴스를 생성하면, Heap 영역에 문자열을 저장하기 위한 char[] 배열을 준비한다.
 */
package step09;

public class Exam067_2 /*extends Object*/ {
  public static void main(String[] args) {
    String s1 = new String("Hello, world!");
    System.out.println(s1);
    
    // String 인스턴스를 만드는 단축 표기법
    String s2 = "Hello, world!"; // => new String("Hello, world!") 와 같다.
    System.out.println(s2);
    
    /* 주의!
     * s1, s2 변수는 레퍼런스이다. 즉 String 인스턴스의 주소를 저장하는 변수이다.
     */
  }

}







