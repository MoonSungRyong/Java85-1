/* 주제: 리플렉션 API - 인스턴스 생성 
 */
package step14;

public class Exam095_4 {
  
  static class Student {
    String name;
    int age;
    
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }
  }
  
  public static void main(String[] args) throws Exception {
    Class c1 = Class.forName("step14.Exam095_4$Student");
    
    // 인스턴스 생성하기
    Student s1 = (Student)c1.newInstance(); // new Student();
    
    s1.setName("홍길동");
    s1.setAge(10);
    
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
  }
}









