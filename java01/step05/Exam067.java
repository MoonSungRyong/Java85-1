//주제: 명령어 흐름을 제어하는 문법 - 반복문 for

public class Exam067 {
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);

    for (int i = 1; i <= count; i++)
      System.out.println(i);
  }
}

/*
문법
- for (변수초기화문장; 조건문; 증가/감소문) 한 개의 명령어;
- for (변수초기화문장; 조건문; 증가/감소문) {여러 개의 명령어};
- 실행순서
1) 변수초기화문장 실행
2) 조건문 실행
참이면,
  - 명령어 실행
  - 증가/감소문 실행
  - 2) 번으로 간다
거짓이면,
  - 반복문 나간다.
*/
