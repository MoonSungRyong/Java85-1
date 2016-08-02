/* 주제: 리플렉션 API - 메서드 호출 
 */
package step14;

import java.lang.reflect.Method;

public class Exam095_5 {
  
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
    Student s1 = new Student();
    Class c = s1.getClass();
    
    // low level(기계 관점) 표현법 => 메서드 정보가 들어 있는 메모리의 주소 얻기
    // high level(인간 관점) 표현법 => 메서드 정보를 다룰 객체 얻기 
    Method m1 = c.getMethod("setName", String.class);
    Method m2 = c.getMethod("setAge", int.class);
    
    // 메서드 정보를 갖고 호출하기
    // low level 표현법 => 메서드 정보가 들어있는 주소를 줄테니 해당 메서드를 호출하라!
    // high level 표현법 => 메서드를 관리하는 객체에게 호출하라고 명령을 내린다.
    m1.invoke(s1, "홍길동");
    m2.invoke(s1, 20);
    
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
  }
}









