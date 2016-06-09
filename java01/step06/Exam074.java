//주제: 기타 - 문자열을 가지고 문자 배열을 만들기

public class Exam074 {
  public static void main(String[] args) {
    String s = "computer";
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
