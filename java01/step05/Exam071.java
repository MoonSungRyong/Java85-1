//주제: 명령어 흐름을 제어하는 문법 - 중첩 반복문 탈출 2

public class Exam071 {
  public static void main(String[] args) {

    ohora: // ohora의 적용 범위는 한 문장 또는 한 블록이다.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 5)
          break ohora; // ohora 블록을 탈출한다.
        System.out.printf(">%d\n", j);
      }
      System.out.printf("[%d]\n", i);
    }


  }
}

/*
# break 라벨명
- 라벨이 붙은 명령 블록을 탈출한다.
*/
