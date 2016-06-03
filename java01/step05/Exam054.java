//주제: 명령어 흐름을 제어하는 문법 - 조건문 if

public class Exam054 {
  public static void main(String[] args) {
    int age = 18;

    if (age < 18) System.out.println("미성년");
    if (age >= 18) System.out.println("성년");
  }
}

/*
if 문법
1) if (조건) 명령문 한 개;
2) if (조건) {블록}   : 블록은 한 개의 명령문으로 간주한다.

*/
