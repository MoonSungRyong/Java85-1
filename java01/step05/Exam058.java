//주제: 명령어 흐름을 제어하는 문법 - if ~ else의 잘못된 사용

public class Exam058 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18)
      System.out.println("---------------------"); // if의 끝이다.
      System.out.println("미성년"); // 얘는 뭐냐? 새로 시작하는 명령문.
      System.out.println("---------------------");
    else // 결국 위의 if 하고 상관없는 문장이 되었다. 오류!
      System.out.println("---------------------");
      System.out.println("성년");
      System.out.println("---------------------");
  }
}

/*
if ~ else 문법
1) if (조건) 명령문 한 개; else 명령문 한 개;
2) if (조건) {여러 개의 명령문} else {여러 개의 명령문}

*/
