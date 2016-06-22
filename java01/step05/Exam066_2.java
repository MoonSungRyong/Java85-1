//주제: 명령어 흐름을 제어하는 문법 - 반복문 while과 변수

public class Exam066_2 {
  public static void main(String[] args) {
    //1) 반복문 안에서 변수 생성
    int count = 0;
    while (count++ < 10) {
      int i = 0; // 반복할 때 마다 변수를 생성한다. => 성능 저하 원인.
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
