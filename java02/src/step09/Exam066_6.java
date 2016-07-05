/* 주제: Object 클래스 - hashCode() 재정의
 * 해시코드
 * => 각 인스턴스 별로 부여된 고유의 식별 값
 * => 4바이트 정수 값으로 되어 있다. 
 */
package step09;

public class Exam066_6 /*extends Object*/ {
  public static void main(String[] args) throws Exception {
    //1) 해시코드 재정의 전
    A3 obj1 = new A3();
    obj1.var1 = 100;
    
    A3 obj2 = new A3();
    obj2.var1 = 100;
    
    // Object로부터 상속 받은 원래의 hashCode()는 각 인스턴스마다 고유의 식별 값을 리턴한다.
    System.out.printf("obj1: %d\n", obj1.hashCode());
    System.out.printf("obj2: %d\n", obj2.hashCode());
    
    //2) 해시코드 재정의 후
    A4 obj3 = new A4();
    obj1.var1 = 100;
    
    A4 obj4 = new A4();
    obj2.var1 = 100;
    
    // A4 클래스는 hashCode()를 재정의하였다. 
    // => 같은 값을 갖는 경우 같은 해시코드를 리턴하도록 재정의 하였다.
    System.out.printf("obj3: %d\n", obj3.hashCode());
    System.out.printf("obj4: %d\n", obj4.hashCode());
  }

}







