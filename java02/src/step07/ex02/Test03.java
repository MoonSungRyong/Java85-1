/* 주제: 레퍼런스 배열 연습2 - 입력 받은 데이터를 배열에 보관하기
 => 예)
이름? 홍길동
전화? 010-2222-3333
이메일? hong@test.com
회사? 비트캠프
직위? 대리
계속 입력하시겠습니까?(y/n) y
이름? 임꺽정
전화? 010-2222-3334
이메일? leem@test.com
회사? 비트캠프
직위? 사원
계속 입력하시겠습니까?(y/n) n
홍길동, 010-2222-3333, 비트캠프, 대리
임꺽정, 010-2222-3334, 비트캠프, 사원
*/
package step07.ex02;

import java.util.*;

public class Test03 {
  public static void main(String[] args) {
    Scanner keyScanner = new Scanner(System.in);
    Contact[] contacts = new Contact[100];
    int i = 0;

    Contact contact;
    String answer;
    while (true) {
      contact = new Contact();
      System.out.print("이름? ");
      contact.name = keyScanner.nextLine();
      System.out.print("전화? ");
      contact.tel = keyScanner.nextLine();
      System.out.print("이메일? ");
      contact.email = keyScanner.nextLine();
      System.out.print("회사? ");
      contact.company = keyScanner.nextLine();
      System.out.print("직위? ");
      contact.position = keyScanner.nextLine();

      contacts[i++] = contact;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      answer = keyScanner.nextLine();
      if (answer.equals("n") || answer.equals("") || answer.equals("N"))
        break;
    }

    for (int x = 0; x < i; x++) {
      System.out.printf("%s, %s, %s, %s\n",
        contacts[x].name, contacts[x].tel, contacts[x].company, contacts[x].position);
    }
  }
}

/*

*/
