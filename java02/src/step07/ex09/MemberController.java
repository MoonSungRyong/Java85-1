/* 역할: 멤버 관리(등록Create/조회Read,Retrieve/변경Update/삭제Delete); CRUD*/
package step07.ex09;

import java.util.Scanner;

public class MemberController {
  static Scanner keyScanner;
  
  Member[] members = new Member[100];
  int i = 0;
  String menuName;

  public MemberController() {}
  
  public MemberController(String menuName) {
    this.menuName = menuName;
  }
  
  public void service() {
    String command;
    label1: while (true) {
      System.out.printf("메인/%s> ", this.menuName);
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
    Member member = new Member();
    System.out.print("이름? ");
    member.name = keyScanner.nextLine();
    System.out.print("이메일? ");
    member.email = keyScanner.nextLine();
    System.out.print("암호? ");
    member.password = keyScanner.nextLine();
    
    this.members[this.i++] = member;
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
      System.out.printf("%d, %s, %s, %s\n",
          x,
          this.members[x].name, 
          this.members[x].email, 
          this.members[x].signedUpDate);
    }
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 회원 정보가 없습니다.");
      return;
    }
    
    Member member = this.members[no];
    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("가입일: %s\n", member.signedUpDate);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 회원 정보가 없습니다.");
      return;
    }
    
    Member member = this.members[no];
    System.out.printf("이름(%s)? ", member.name);
    member.name = keyScanner.nextLine();
    System.out.printf("이메일(%s)? ", member.email);
    member.email = keyScanner.nextLine();
    System.out.printf("암호(*****)? ");
    member.password = keyScanner.nextLine();
  }
  
  void delete() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    if (no < 0 || no >= this.i) {
      System.out.println("해당 회원 정보가 없습니다.");
      return;
    }
    
    for (int x = no; x < this.i; x++) {
      members[x] = members[x + 1];
    }
    this.i--;
  }
}

/*

*/
