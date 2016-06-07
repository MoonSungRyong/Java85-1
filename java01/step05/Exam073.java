//주제: 명령어 흐름을 제어하는 문법 - 반복문 while과 break, continue

public class Exam073 {
  public static void main(String[] args) {
    int i = -1;
    while (i < 10) {
      i++;
      if (i == 3)
        continue; // while문인 경우, 조건 검사로 이동한다.
      if (i == 7)
        break; // 자신이 속한 반복문을 탈출한다.
      System.out.println(i);
    }
  }
}

/*
# break
- break가 소속된 반복문을 탈출한다.
*/
