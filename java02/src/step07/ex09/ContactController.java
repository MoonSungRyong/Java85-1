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
package step07.ex09;

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
    String command;
    label1: while (true) {
      System.out.printf("메인/%s> ", this.contactName);
      command = keyScanner.nextLine();
      
      switch (command) {
      case "main":
        break label1;
      case "add":
        this.add();
        break;
      case "list":
        this.list();
        break;
      case "detail":
        this.detail();
        break;
      case "update":
        this.update();
        break;
      case "delete":
        this.delete();
        break;
      default:
        System.out.println("사용할 수 없는 명령입니다.");
      }
    }
    
  }

  void add() {
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
    
    this.contacts[this.i++] = contact;
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  void list() {
    for (int x = 0; x < this.i; x++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          x,
          this.contacts[x].name, 
          this.contacts[x].tel, 
          this.contacts[x].company, 
          this.contacts[x].position);
    }
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 연락처가 없습니다.");
      return;
    }
    
    Contact contact = this.contacts[no];
    System.out.printf("이름: %s\n", contact.name);
    System.out.printf("전화: %s\n", contact.tel);
    System.out.printf("이메일: %s\n", contact.email);
    System.out.printf("회사: %s\n", contact.company);
    System.out.printf("직위: %s\n", contact.position);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 연락처가 없습니다.");
      return;
    }
    
    Contact contact = this.contacts[no];
    System.out.printf("이름(%s)? ", contact.name);
    contact.name = keyScanner.nextLine();
    System.out.printf("전화(%s)? ", contact.tel);
    contact.tel = keyScanner.nextLine();
    System.out.printf("이메일(%s)? ", contact.email);
    contact.email = keyScanner.nextLine();
    System.out.printf("회사(%s)? ", contact.company);
    contact.company = keyScanner.nextLine();
    System.out.printf("직위(%s)? ", contact.position);
    contact.position = keyScanner.nextLine();
  }
  
  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 연락처가 없습니다.");
      return;
    }
    
    for (int x = no; x < this.i; x++) {
      contacts[x] = contacts[x + 1];
    }
    this.i--;
  }
}

/*

*/
