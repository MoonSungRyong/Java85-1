/* 주제: String 클래스 - String 클래스가 없다면
 * => char 배열을 사용하여 문자열을 저장하고 꺼내야 한다.
 */
package step09;

public class Exam067_1 /*extends Object*/ {
  public static void main(String[] args) {
    // "Hello, world!" 문자열 저장하기
    char[] str = {'H','e','l','l','o',',',' ','w','o','r','l','d','!'};
    for (char c : str) {
      System.out.print(c);
    }
  }

}







