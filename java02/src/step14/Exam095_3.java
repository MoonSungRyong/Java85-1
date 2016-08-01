/* 주제: 리플렉션 API - 메서드 정보 얻기
 */
package step14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam095_3 {
  static class Student {
    public void m1() {}
    void m2() {}
    protected void m3() {}
    private void m4() {}
  }
  
  public static void main(String[] args) throws Exception {
    Class c1 = Student.class;
    
    Method[] methods = c1.getDeclaredMethods();
    for (Method m : methods) {
      System.out.printf("%s():%s\n", m.getName(), m.getReturnType().getName());
    }
    System.out.println("-----------------------");
    
    Class c2 = Student2.class;
    methods = c2.getDeclaredMethods();
    for (Method m : methods) {
      System.out.printf("%s():%s\n", m.getName(), m.getReturnType().getName());
    }
    System.out.println("-------------------------");
    
    methods = c2.getMethods();
    for (Method m : methods) {
      System.out.printf("%s():%s\n", m.getName(), m.getReturnType().getName());
    }
    System.out.println("-------------------------");
    
  }
}

/* Class.getDeclaredMethods()
 * => 클래스에 선언된 모든 메서드의 정보를 리턴한다.
 * => 단 상속받은 메서드는 제외한다.
 * => public, protected, default, private 메서드 모두 리턴한다. 
 * 
 * Class.getMethods()
 * => 클래스에 선언된 메서드 중에서 public 메서드 정보를 리턴한다.
 * => 상속받은 메서드 포함한다.
 */








