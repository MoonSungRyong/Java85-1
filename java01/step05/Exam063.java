//주제: 명령어 흐름을 제어하는 문법 - if ~ else if ~ else if ~ else(3)

public class Exam063 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age > 0)
      if (age >= 18)
        System.out.println("성년");
    else // 들여 쓰기에 속지말라! 이 else는 if (age >= 18)의 짝궁이다.
      System.out.println("사람이 아니다.");
  }
}

/*
if ~ else 문법
1) if (조건) 명령문 한 개; else 명령문 한 개;
2) if (조건) {여러 개의 명령문} else {여러 개의 명령문}

else 는 가까운 if 문에 묶인다.

*/
