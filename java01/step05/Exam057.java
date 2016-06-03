//주제: 명령어 흐름을 제어하는 문법 - if ~ else

public class Exam057 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18)
      System.out.println("미성년");
    else
      System.out.println("성년");
  }
}

/*
if ~ else 문법
1) if (조건) 명령문 한 개; else 명령문 한 개;
2) if (조건) {여러 개의 명령문} else {여러 개의 명령문}

else 는 if 문 없이 사용할 수 없다.
if 는 else 없이 사용할 수 있다.
*/
