/* 역할: 프로젝트 관리(등록Create/조회Read,Retrieve/변경Update/삭제Delete); CRUD*/
package step07.ex09;

import java.util.Scanner;

public class ProjectController {
  static Scanner keyScanner;
  String menuName;
  
  ProjectDao projectDao = new ProjectDao();

  public ProjectController() {}
  
  public ProjectController(String menuName) {
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
    Project project = new Project();
    System.out.print("제목? ");
    project.title = keyScanner.nextLine();
    System.out.print("내용? ");
    project.description = keyScanner.nextLine();
    System.out.print("시작일? ");
    project.startDate = keyScanner.nextLine();
    System.out.print("종료일? ");
    project.endDate = keyScanner.nextLine();
    
    projectDao.insert(project);
  }

  static boolean prompt() {
    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String answer = keyScanner.nextLine();
    if (answer.equals("n") || answer.equals("") || answer.equals("N"))
      return false;
    return true;
  }

  void list() {
    Project[] projects = projectDao.selectList();
    for (int x = 0; x < projects.length; x++) {
      System.out.printf("%d, %s, %s, %s\n",
          x,
          projects[x].title, 
          projects[x].startDate, 
          projects[x].endDate);
    }
  }
  
  void detail() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Project project = projectDao.selectOne(no);
    
    if (project == null) {
      System.out.println("해당 프로젝트 정보가 없습니다.");
      return;
    }
    
    System.out.printf("제목: %s\n", project.title);
    System.out.printf("내용: %s\n", project.description);
    System.out.printf("시작일: %s\n", project.startDate);
    System.out.printf("종료일: %s\n", project.endDate);
  }
  
  void update() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyScanner.nextLine());
    
    Project originProject = projectDao.selectOne(no);
    
    if (originProject == null) {
      System.out.println("해당 프로젝트 정보가 없습니다.");
      return;
    }
    
    Project newProject = new Project();
    System.out.printf("제목(%s)? ", originProject.title);
    newProject.title = keyScanner.nextLine();
    System.out.printf("내용(%s)? ", originProject.description);
    newProject.description = keyScanner.nextLine();
    System.out.printf("시작일(%s)? ", originProject.startDate);
    newProject.startDate = keyScanner.nextLine();
    System.out.printf("종료일(%s)? ", originProject.endDate);
    newProject.endDate = keyScanner.nextLine();
    
    System.out.print("변경하시겠습니까?(Y/n) ");
    String answer = keyScanner.nextLine();
    
    if (answer.equals("y") || answer.equals("") || answer.equals("Y")) {
      projectDao.update(no, newProject);
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
      int count = projectDao.delete(no);
      if (count > 0) {
        System.out.println("삭제하였습니다.");
      } else {
        System.out.println("해당 프로젝트가 없습니다.");
      }
    } else {
      System.out.println("삭제 취소하였습니다.");
    }
  }
}

/*

*/
