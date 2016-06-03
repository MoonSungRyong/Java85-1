//주제: 명령어 흐름을 제어하는 문법 - switch 문

public class Exam064 {
  public static void main(String[] args) {
    int level = Integer.parseInt(args[0]);

    switch (level) {
    case 0:
      System.out.println("손님");
    case 1:
      System.out.println("회원");
    case 9:
      System.out.println("관리자");
    default:
      System.out.println("권한이 없습니다.");
    }
  }
}

/*
switch (값)
- 값은 반드시 32비트 정수 값 이어야 한다.
  => byte, short, int, char 등.
- JDK 7 부터 String 도 가능.

주의!
- break나 return 과 같은 멈춤 명령이 없으면 switch 문 끝날 때까지 실행한다.


*/
