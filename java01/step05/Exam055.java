//주제: 명령어 흐름을 제어하는 문법 - 조건문 if가 적용되는 범위

public class Exam055 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    if (age < 18)
      System.out.println("------------"); // 이 명령문만 if 소속이다.
      System.out.println("미성년");       // 자바는 들여쓰기를 인식하지 않는다.
      System.out.println("------------"); // if는 오직 한 문장만 포함한다.


  }
}

/*
if 문법
1) if (조건) 명령문 한 개;
2) if (조건) {블록}   : 블록은 한 개의 명령문으로 간주한다.

*/
