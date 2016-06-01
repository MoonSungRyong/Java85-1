//주제: 표현 가능한 값의 범위 - 문자 표현

public class Exam016 {
  public static void main(String[] args) {
    System.out.println(0x41); // 숫자로 간주하고 10진수 65를 출력.
    System.out.println(65);
    System.out.println((char)0x41); // 주어진 코드 값의 문자 출력.
    System.out.println((char)65); // 주어진 코드 값의 문자 출력

    // 따옴표를 사용하면 (char) 명령이 필요 없다.
    System.out.println('A'); 

  }
}

/*

*/
