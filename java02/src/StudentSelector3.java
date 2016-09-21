import java.util.ArrayList;

public class StudentSelector3 {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "e에2승", "문선애팀"
    };

    int no = 0;
    System.out.println("선택된 팀은?");
    
    for (int i = 0; i < 77; i++) {
      System.out.print(".");
      Thread.currentThread().sleep(200);
      no = (int)(Math.random() * 2);
    }
    
    System.out.println(students[no]);
  }
}

