/* 주제: 리플렉션 API - 클래스 정보는 오직 한 개
 */
package step14;

import java.lang.reflect.Method;

public class Exam095_7 {
  
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
    Class c1 = Class.forName("step14.Exam095_7$Student");
    Class c2 = Class.forName("step14.Exam095_7$Student");
    Student s1 = new Student();
    Class c3 = s1.getClass();
    
    if (c1 == c2)
      System.out.println("c1 == c2");
    
    if (c1 == c3) 
      System.out.println("c1 == c3");
    
  }
}









