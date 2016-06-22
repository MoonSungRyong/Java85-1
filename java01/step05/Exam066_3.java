//주제: 명령어 흐름을 제어하는 문법 - 반복문 while과 변수

public class Exam066_3 {
  public static void main(String[] args) {
    //2) 반복문 밖에 변수 생성
    int count = 0;
    int i = 0; // <=== 밖에 변수 선언. 한 번만 생성되어 while 문에서 사용된다.
    while (count++ < 10) {
      System.out.println(i);
      i++;
      if (i > 5) {
        break;
      }
    }
  }
}

/*
*/
