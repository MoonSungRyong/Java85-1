/* 주제: 레퍼런스 배열 연습2 - 명령어들을 재사용하고 관리하기 좋게 블록으로 묶는다.
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

public class Test04 {
  static Scanner keyScanner = new Scanner(System.in);

  public static void main(String[] args) {
    Contact[] contacts = new Contact[100];
    int i = 0;

    Contact contact;
    String answer;
    while (true) {
      contact = inputContact();
      contacts[i++] = contact;
      if (!prompt())
        break;
    }

    for (int x = 0; x < i; x++) {
      printContact(contacts[x]);
    }
  }

  static Contact inputContact() {
    Contact contact = new Contact();
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
    return contact;
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  static void printContact(Contact contact) {
    System.out.printf("%s, %s, %s, %s\n",
      contact.name, contact.tel, contact.company, contact.position);
  }
}

/*

*/
