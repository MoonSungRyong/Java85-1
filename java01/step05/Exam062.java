//주제: 명령어 흐름을 제어하는 문법 - if ~ else if ~ else if ~ else(3)

public class Exam062 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    // if ~ else 문을 보기 좋게 정리한다.
    if (age < 18)
      System.out.println("미성년");
    else if (age >= 18 && age < 50)
      System.out.println("성년");
    else if (age >= 50 && age < 65)
      System.out.println("중년");
    else
      System.out.println("노인");


  }
}

/*
if ~ else 문법
1) if (조건) 명령문 한 개; else 명령문 한 개;
2) if (조건) {여러 개의 명령문} else {여러 개의 명령문}

if ~ else는 한 문장으로 취급한다!

*/
