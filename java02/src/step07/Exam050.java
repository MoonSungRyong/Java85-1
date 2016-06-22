// 주제: 기타 - import 사용법
// => 자바 컴파일러에게 클래스를 찾기 위한 장소를 알려주는 문법
package step07;

// import 문은 패키지 문 아래에 둬야 한다.
// Scanner 클래스가 어느 패키지에 있는 지 컴파일러에게 알려준다.
import java.util.Scanner;

public class Exam050 {
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
# import 사용법
1) 클래스의 패키지 정보를 정확하게 지정
   => import java.util.Scanner;
2) 클래스가 소속된 패키지 정보를 지정
   => import java.util.*;
   => 장점: java.util의 모든 클래스를 자유롭게 사용할 수 있다.
   => 단점: 유지보수할 때 코드에서 사용한 클래스가 정확하게 어떤 패키지에 있는지
            알기 어렵다. => 실문에서는 가능한 1)번 방식을 사용한다.
자주 오해하는 개념!
  => import 문장이 많으면 .class 파일의 크기가 커진다고 착각한다.
  => import는 컴파일할 때 컴파일러에게 전달하는 정보이기 때문에
     컴파일한 후에는 import 문을 제거한다.
  => 개발자 중에서 import 문의 줄 수를 줄이기 위해 wildcard(*)를
     사용하는 경우가 있다. => .class 파일의 크기하고 상관없다. => 부질없는 짓이다.
*/
