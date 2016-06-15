// 주제: 반복문 사용 - do ~ while
package step04;

public class Exam024 {
  public static void main(String[] args) {
    //1) while
    // => 먼저 조건을 따져서 참인 경우 반복한다.
    // => 0번 이상 반복할 경우 사용한다.
    int count = 0;
    while (count < 10) {
      System.out.print(count + " ");
      count++;
    }
    System.out.println("\n-----------------------");

    //2) do ~ while
    // => 조건을 따지기 전에 먼저 실행
    // => 1번 이상 반복할 때 사용한다.
    count = 0;
    do {
      System.out.print(count + " ");
      count++;
    } while (count < 10);
    System.out.println("\n-----------------------");

  }

}

/*

*/
