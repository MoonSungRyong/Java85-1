import java.util.ArrayList;

public class StudentSelector3 {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "e에2승", "문선애팀", "원지선과난장이들", "류세현과외동들", "백권호팀"
    };

    ArrayList<String> list = new ArrayList<>();
    for (String name : students) {
      list.add(name);
    }
    
    int no = 0;
    System.out.println("선택된 팀은?");
    
    while (list.size() > 0) {
      for (int i = 0; i < 20; i++) {
        System.out.print(".");
        Thread.currentThread().sleep(200);
        no = (int)(Math.random() * list.size());
      }
      System.out.println(list.remove(no));
    }
    
  }
}

