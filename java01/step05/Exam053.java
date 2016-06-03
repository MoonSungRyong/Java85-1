//주제: 명령어 흐름을 제어하는 문법 - 블록 안에 선언된 변수

public class Exam053 {
  public static void main(String[] args) {
    int a = 10;

    {
      //int a = 20; // 블록 밖의 변수와 같은 이름으로 변수를 선언할 수 없다.
      int b = 20;
      System.out.println(a); // 바깥 쪽 변수를 사용할 수 있는가? 예
      System.out.println(b);
      a = 100; // 바깥 쪽 변수의 값을 변경할 수 있는가?
    }

    System.out.println(a);
    System.out.println(b); // 안쪽 블록에서 만든 변수를 사용할 수 있는가? 아니오
  }
}

/*
블록 안에 선언된 변수
- 그 블록을 벗어나면 블록 안에 선언된 변수는 제거된다.

*/
