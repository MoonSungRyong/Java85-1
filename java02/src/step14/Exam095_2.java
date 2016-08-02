/* 주제: 리플렉션 API - 변수 정보 얻기
 */
package step14;

import java.lang.reflect.Field;

public class Exam095_2 {
  static class Student {
    public String name;
    String tel;
    protected String email;
    private int age;
  }
  
  public static void main(String[] args) throws Exception {
    Class c1 = Student.class;
    
    Field[] fields = c1.getDeclaredFields();
    for (Field f : fields) {
      System.out.printf("%s: %s\n", f.getName(), f.getType().getName());
    }
    System.out.println("-----------------------");
    
    Class c2 = Student2.class;
    fields = c2.getDeclaredFields();
    for (Field f : fields) {
      System.out.printf("%s: %s\n", f.getName(), f.getType().getName());
    }
    System.out.println("-----------------------");
    
    fields = c2.getFields();
    for (Field f : fields) {
      System.out.printf("%s: %s\n", f.getName(), f.getType().getName());
    }
  }
}

/* Field 클래스?
 * => 필드(변수) 정보를 다루는 객체
 * 
 * Class.getDeclaredFields()
 * => 클래스에 선언된 모든 필드의 정보를 리턴한다.
 * => 단 상속받은 필드는 제외한다.
 * => public, protected, default, private 필드 모두 리턴한다. 
 * 
 * Class.getFields()
 * => 클래스에 선언된 모든 public 필드의 정보를 리턴한다.
 * => 수퍼클래스로부터 상속받은 필드도 포함한다. 
 */








