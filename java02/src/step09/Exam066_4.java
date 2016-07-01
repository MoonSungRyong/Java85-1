/* 주제: Object 클래스 - equals() 재정의 
 */
package step09;

public class Exam066_4 /*extends Object*/ {
  public static void main(String[] args) throws Exception {
    A2 r1 = new A2();
    r1.var1 = 200;
    
    A2 r2 = new A2();
    r2.var1 = 200;
    
    if (r1 == r2) { // 인스턴스 주소가 다르다.
      System.out.println("r1 == r2");
    }
    //A2는 equals()를 재정의하지 않았기 때문에,
    // Object로부터 상속받은 메서드를 그대로 사용한다.
    // 즉 주소를 비교함으로 r1 == r2 연산과 같다. 
    if (r1.equals(r2)) { 
      System.out.println("r1.equals(r2)");
    }
    
    // 요구사항? String 처럼 같은 값을 가진 인스턴스에 대해서는
    // equals() 호출할 때 true를 리턴하길 원한다.
    String s1 = new String("aaa");
    String s2 = new String("aaa");
    if (s1 == s2) { //s1에 저장된 주소와 s2에 저장된 주소가 다르다.
      System.out.println("s1 == s2");
    }
    if (s1.equals(s2)) { // 주소를 비교하는 것이 아니라 내용을 비교한다.
      System.out.println("s1.equals(s2)");
    }
  }

}







