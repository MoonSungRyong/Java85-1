import java.util.ArrayList;

public class StudentSelector3 {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "e에2승", "김도훈팀", "류세현과외동들", "문선애팀", "원지선과난쟁이들"
    };

    ArrayList<String> list = new ArrayList<>();
    for (String s : students) {
      list.add(s);
    }
    
    int count = (int)(Math.random() * 100);
    for (int i = 0; i < count; i++) {
      Math.random();
    }
    System.out.println("선택된 팀은?");
    
    while (list.size() > 0) {
      for (int i = 0; i < 10; i++) {
        System.out.print(".");
        Thread.currentThread().sleep(1000);
      }
  
      int no = (int)(Math.random() * list.size());
      System.out.println(list.remove(no));
    }
  }
}

