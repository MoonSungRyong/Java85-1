//주제: 명령어 흐름을 제어하는 문법 - 반복문 while

public class Exam066 {
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);

    int temp = count;
    while (temp > 0) {
      System.out.println(temp);
      temp--;
    }
    System.out.println("----------------------");
    temp = count;
    while (temp > 0)
      System.out.println(temp--);
  }
}

/*
문법
- while (조건) 한 개의 문장;
- while (조건) {여러 개의 문장}
- 조건이 참인 동안 계속 문장을 실행한다.
- 반복하는 중간에 멈추고 싶으면 break를 사용하라!
- 다음 반복으로 바로 넘어가고 싶다면 continue를 사용하라!

*/
