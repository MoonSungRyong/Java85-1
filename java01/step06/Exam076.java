//주제: 기타 - 문자열을 대문자 또는 소문자로 만들기

public class Exam076 {
  public static void main(String[] args) {
    String s = "circleOfNumbers";
    System.out.println(s);
    System.out.println(s.toLowerCase()); // 소문자로 만들기
    System.out.println(s.toUpperCase()); // 대문자로 만들기

    char[] chars = s.toUpperCase().toCharArray(); // 문자열 -> 대문자로 변환 -> 배열
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
