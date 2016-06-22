// 주제: 기타 - 사용자로부터 키보드 입력 받기2
//              패키지 클래스 사용법
// => 사용자로부터 이름과 나이 입력 받기
package step07;

public class Exam049 {
  public static void main(String[] args) {
    java.util.Scanner keyScanner = new java.util.Scanner(System.in);
    System.out.print("이름? ");
    String name = keyScanner.nextLine(); // 입력 문자를 줄 단위로 잘라준다.

    System.out.print("나이? ");
    int age = /*java.lang.*/Integer.parseInt(keyScanner.nextLine());

    System.out.printf("%s(%d)\n", name, age);
  }
}

/*
# 패키지 클래스 사용법
- 다른 패키지에 소속된 클래스를 사용할 때는
  반드시 패키지명을 지정해야 한다.
- 예외!
  java.lang 패키지의 클래스를 사용할 때는 지정하지 않아도 된다.
  자바 컴파일러가 자동으로 찾는다.
- 주의!
  java.lang 패키지를 생략한다고 해서 그 하위 패키지까지 허용되는 것은 아니다.
  java.lang.relect, java.lang.annotation 등 그 하위 패키지의 클래스를 사용할 때는
  무조건 패키지 이름을 적어야 한다.
*/
