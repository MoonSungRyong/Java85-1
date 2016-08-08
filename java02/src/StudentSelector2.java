import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSelector2 {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    /*
    String[] students = {
      "송성은", "양찬", "전도연", "김도훈", 
      "백권호", "이상원", "문선애", "김용현",
      "권태임", "원지선", "류세현", "이승도",
      "양동신", "이호형", "함지호", "문성룡",
      "한동수", "손덕현", "공승환", "박나현",
      "배철한", "윤인수"
    };*/
    
    //String[] students2 = {"원지선","양찬","배철한","이호형","전도연"};
    /*
    String[] students2 = {"김도훈","이상원", "문선애","권태임","류세현",
        "양동신","문성룡","한동수", "손덕현", "공승환", "박나현","윤인수"};
    */
    String[] students2 = {"이승도팀", "함지호팀", "백권호팀", "김용현팀", "송성은팀"};
    
    List<String> list = createList(students2);
    while (list.size() > 0) {
      System.out.println(selectName(list));
      keyScan.nextLine();
    }
    
  }
  
  private static List<String> createList(String[] names) {
    ArrayList<String> list = new ArrayList<>();
    for (String name : names) {
      list.add(name);
    }
    return list;
  }
  
  private static String selectName(List<String> studentList) throws Exception {
    int count = (int)(Math.random() * 100);
    for (int i = 0; i < count; i++) {
      Math.random();
    }
    
    for (int i = 0; i < 10; i++) {
      System.out.print(".");
      Thread.currentThread().sleep(1000);
    }
    
    int no = (int)(Math.random() * studentList.size());
    return studentList.remove(no);
  }
}

/* 팀
 * => 이승도,전도연,문성룡,류세현,윤인수
 * => 함지호,원지선,이상원,공승환
 * => 백권호,이호형,김도훈,양동신
 * => 김용현,양찬,권태임,문선애
 * => 송성은,배철한,한동수,손덕현,박나현
 */