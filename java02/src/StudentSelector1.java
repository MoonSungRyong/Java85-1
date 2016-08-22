public class StudentSelector1 {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "백권호", "이상원", "문선애", "김용현",
      "송성은", "양찬", "전도연", "김도훈", 
      "양동신", "이호형", "함지호", "문성룡",
      "한동수", "손덕현", "공승환", "박나현",
      "배철한", "윤인수",
      "권태임", "원지선", "류세현", "이승도"
    };

    int count = (int)(Math.random() * 100);
    for (int i = 0; i < count; i++) {
      Math.random();
    }
    System.out.print("선택된 학생은");
    for (int i = 0; i < 6; i++) {
      System.out.print(".");
      Thread.currentThread().sleep(1000);
    }

    int no = (int)(Math.random() * students.length);
    System.out.println(students[no]);

  }
}

