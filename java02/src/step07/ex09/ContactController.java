/* 역할: 역할처 관리(등록Create/조회Read,Retrieve/변경Update/삭제Delete); CRUD*/
package step07.ex09;

import java.util.Scanner;

public class ContactController {
  static Scanner keyScanner;
  String contactName;

  ContactDao contactDao = new ContactDao();// 배열과 인덱스 메모리가 준비됨.

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
    
    contactDao.insert(contact);
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  void list() {
    Contact[] contacts = contactDao.selectList();
    for (int x = 0; x < contacts.length; x++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          x,
          contacts[x].name, 
          contacts[x].tel, 
          contacts[x].company, 
          contacts[x].position);
    }
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Contact contact = contactDao.selectOne(no);
    
    if (contact == null) {
      System.out.println("해당 연락처가 없습니다.");
      return;
    }
    
    System.out.printf("이름: %s\n", contact.name);
    System.out.printf("전화: %s\n", contact.tel);
    System.out.printf("이메일: %s\n", contact.email);
    System.out.printf("회사: %s\n", contact.company);
    System.out.printf("직위: %s\n", contact.position);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Contact originContact = contactDao.selectOne(no);
    if (originContact == null) {
      System.out.println("해당 연락처가 없습니다.");
      return;
    }
    
    Contact newContact = new Contact();
    System.out.printf("이름(%s)? ", originContact.name);
    newContact.name = keyScanner.nextLine();
    System.out.printf("전화(%s)? ", originContact.tel);
    newContact.tel = keyScanner.nextLine();
    System.out.printf("이메일(%s)? ", originContact.email);
    newContact.email = keyScanner.nextLine();
    System.out.printf("회사(%s)? ", originContact.company);
    newContact.company = keyScanner.nextLine();
    System.out.printf("직위(%s)? ", originContact.position);
    newContact.position = keyScanner.nextLine();
    
    System.out.print("변경하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      contactDao.update(no, newContact);
      System.out.println("변경하였습니다.");
    } else {
      System.out.println("변경 취소하였습니다.");
    }
  }
  
  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    System.out.print("삭제하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      int count = contactDao.delete(no);
      if (count > 0) {
        System.out.println("삭제하였습니다.");
      } else {
        System.out.println("해당 연락처가 없습니다.");
      }
    } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
}

/*

*/
