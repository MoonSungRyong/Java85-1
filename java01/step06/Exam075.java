//주제: 기타 - 프로그램 아규먼트를 가지고 숫자와 문자 배열 만들기

public class Exam075 {
  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);
    char[] chars = args[1].toCharArray();

    System.out.println(value);
    System.out.println("--------------");
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
