//주제: 명령어 흐름을 제어하는 문법 - 반복문 for와 continue

public class Exam072 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // i=5 일 때, 다음 문장을 실행하지 않고 즉시 증가/감소문으로 이동한다.
      if (i == 5)
        continue;
      System.out.println(i);
    }
  }
}

/*
# break
- break가 소속된 반복문을 탈출한다.
*/
