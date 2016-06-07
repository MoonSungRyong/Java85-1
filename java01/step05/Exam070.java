//주제: 명령어 흐름을 제어하는 문법 - 중첩 반복문 탈출 1

public class Exam070 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 5)
          break; // 자신이 속한 안쪽의 for문을 탈출한다.
        System.out.printf(">%d\n", j);
      }
      System.out.printf("[%d]\n", i);
    }
  }
}

/*
# break
- break가 소속된 반복문을 탈출한다.
*/
