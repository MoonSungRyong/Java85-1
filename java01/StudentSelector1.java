public class StudentSelector1 {
  public static void main(String[] args) throws Exception {
    String[] students = {
      "송성은", "양찬", "전도연", "김도훈", 
      "백권호", "이상원", "문선애", "김용현",
      "권태임", "원지선", "류세현", "이승도",
      "양동신", "이호형", "함지호", "문성룡",
      "한동수", "손덕현", "공승환", "박나현",
      "배철한", "유기용", "윤인수"
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

/*
변수?
- 값을 저장하기 위해 준비한 메모리의 이름

메모리 준비?
- [메모리의 종류] [메모리 이름];

용어 정리
- 메모리 준비 => 변수 선언
- 메모리 종류 => 데이터 타입(자료형)
- 메모리 이름 => 변수명
- 메모리 => 변수





*/
