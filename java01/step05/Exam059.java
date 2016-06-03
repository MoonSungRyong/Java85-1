//주제: 명령어 흐름을 제어하는 문법 - if ~ else와 블록

public class Exam059 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18) {
      System.out.println("---------------------");
      System.out.println("미성년");
      System.out.println("---------------------");
    } else {
      System.out.println("---------------------");
      System.out.println("성년");
      System.out.println("---------------------");
    }
  }
}

/*
if ~ else 문법
1) if (조건) 명령문 한 개; else 명령문 한 개;
2) if (조건) {여러 개의 명령문} else {여러 개의 명령문}

else는 반드시 if 다음에 바로 와야 한다.
*/
