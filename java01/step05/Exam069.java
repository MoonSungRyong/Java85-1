//주제: 명령어 흐름을 제어하는 문법 - 반복문 for와 break

public class Exam069 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // i=5 일 때 반복 멈추기
      if (i == 5)
        break;
      System.out.println(i);
    }
  }
}

/*
# break
- break가 소속된 반복문을 탈출한다.
*/
