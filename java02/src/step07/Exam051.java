// 주제: 기타 - import 사용법2
// => 자바 컴파일러에게 클래스를 찾기 위한 장소를 알려주는 문법
package step07;

// 와일드카드(*)를 사용하여 패키지를 컴파일러에게 알려 줄 수 있다.
// => wildcard를 import 문이 여러 개일 때,
//    클래스를 찾기 위해 그 패키지를 모두 뒤진다. => 컴파일 속도가 떨어진다.
//    코드의 가독성이 떨어진다. => 클래스가 어느 패키지에 있는 지 바로 알 수 없다.
import java.util.*;

public class Exam051 {
  public static void main(String[] args) {
    // 위에서 Scanner의 위치를 알려줬기 때문에 아래에서는
    // 패키지명을 지정할 필요가 없다.
    Scanner keyScanner = new Scanner(System.in);
    System.out.print("이름? ");
    String name = keyScanner.nextLine(); // 입력 문자를 줄 단위로 잘라준다.

    System.out.print("나이? ");
    int age = /*java.lang.*/Integer.parseInt(keyScanner.nextLine());

    System.out.printf("%s(%d)\n", name, age);
  }
}

/*

*/
