/* 주제: 리플렉션 API - 메서드 정보 추출
 */
package step14;

import java.lang.reflect.Method;

public class Exam095_6 {
  
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
    
    
    //1) 클래스에 존재하는 모든 public 메서드 정보를 추출한다.
    Method[] methods = c.getMethods();
    Class[] paramTypes;
    
    for (Method m : methods) {
      System.out.println(m.getName());
      System.out.printf("  리턴 타입: %s\n", m.getReturnType().getSimpleName());
      
      // 메서드의 파라미터 정보 추출하기 
      paramTypes = m.getParameterTypes();
      if (paramTypes.length == 0)
        continue;
      
      System.out.print("  파라미터 타입: ");
      for (Class paramType : paramTypes) {
        System.out.print(paramType.getSimpleName() + ", ");
      }
      System.out.println();
    }
    
  }
}









