//주제: 명령어 흐름을 제어하는 문법 - if 와 블록

public class Exam056 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18) { // 조건 이 참일 때, 이 블록에 있는 모든 명령문을 실행한다.
      System.out.println("------------");
      System.out.println("미성년");
      System.out.println("------------");
    }

  }
}

/*
if 문법
1) if (조건) 명령문 한 개;
2) if (조건) {블록}   : 블록은 한 개의 명령문으로 간주한다.

*/
