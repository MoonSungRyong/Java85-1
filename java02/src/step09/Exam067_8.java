/* 주제: String 클래스 - split()
 */
package step09;

public class Exam067_8 /*extends Object*/ {
  public static void main(String[] args) {
    String[] arr = "홍길동 임꺽정 유관순 임청하 왕조현 오천련".split(" ");
    for (String s : arr) {
      System.out.println(s);
    }
  }

}






