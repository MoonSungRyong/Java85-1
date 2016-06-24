/* 역할: 역할처 관리(등록Create/조회Read,Retrieve/변경Update/삭제Delete); CRUD
 => 예)
[메인 > 게시판]
이름? 홍길동
전화? 010-2222-3333
이메일? hong@test.com
회사? 비트캠프
직위? 대리
계속 입력하시겠습니까?(y/n) y
[메인 > 게시판]
이름? 임꺽정
전화? 010-2222-3334
이메일? leem@test.com
회사? 비트캠프
직위? 사원
계속 입력하시겠습니까?(y/n) n
[메인 > 게시판]
홍길동, 010-2222-3333, 비트캠프, 대리
임꺽정, 010-2222-3334, 비트캠프, 사원
*/
package step07.ex07;

import java.util.Scanner;

public class ContactController {
  // 공통으로 사용할 변수는 클래스 변수(스태틱 변수)로 선언하라!
  static Scanner keyScanner;
  
  // 개별적으로 관리할 변수는 인스턴스 변수로 선언하라!
  Contact[] contacts = new Contact[100];
  int i = 0;
  String contactName;

  public ContactController() {}
  
  public ContactController(String contactName) {
    this.contactName = contactName;
  }
  
  public void service() {
    Contact contact;
    
    while (true) {
      System.out.printf("[메인 > %s]\n", this.contactName);
      contact = inputContact();
      this.contacts[this.i++] = contact;
      if (!prompt())
        break;
    }

    System.out.printf("[메인 > %s]\n", this.contactName);
    for (int x = 0; x < this.i; x++) {
      printContact(this.contacts[x]);
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
