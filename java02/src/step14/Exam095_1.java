/* 주제: 리플렉션 API - Class라는 클래스
 * Class?
 * => 클래스를 다루는 도구
 * => 클래스의 이름을 알아내거나, 상위 클래스의 정보를 알아낼 때 사용한다.
 * => 클래스가 갖고 있는 공개 멤버(변수와 메서드)의 정보를 알아낼 때 사용한다.
 * => 클래스의 애노테이션 정보를 알아낼 때 사용한다.
 * => 클래스를 메모리에 로딩할 때 사용한다.
 * => 클래스의 인스턴스를 생성할 때 사용할 수 있다.
 */
package step14;

public class Exam095_1 {
  //static Class class = Class.forName("step14.Exam095_1");
  
  static class Student {
    //static Class class = Class.forName("step14.Exam095_1$Student");
    String name;
    String tel;
    String email;
  }
  
  public static void main(String[] args) throws Exception {
    //클래스를 다루는 도구(Class) 얻기
    //1) 클래스를 로딩할 때 - forName()
    Class c1 = Class.forName("step14.Exam095_1$Student");
    System.out.println(c1.getName());
    
    //2) 인스턴스로부터 얻기 - getClass()
    Student s1 = new Student();
    Class c2 = s1.getClass();
    System.out.println(c2.getName());
    
    //3) 모든 클래스가 갖고 있는 기본 스태틱 변수를 통해 얻기 - class 변수
    Class c3 = Student.class;
    System.out.println(c3.getName());
    System.out.println(Student.class.getName());
  }
}









