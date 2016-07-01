/* 주제: Object 클래스 - toString(), hashCode(), equals(), getClass() 
 * => toString(): 인스턴스의 정보 리턴
 *    - 기본: 클래스명@인스턴스식별번호(hashcode)
 *    - 인스턴스의 간략 정보를 리턴할 때 사용한다.
 *    - 기본으로 출력하는 내용은 너무 코드스럽다.
 *      맘에 안드는가? 그럼 재정의하라!
 *      
 * => hashCode(): 인스턴스의 식별 코드 리턴
 *    - 인스턴스를 맵에 저장할 때 태그로 사용한다.
 *    - 인스턴스끼리 값을 비교할 때 사용한다.
 *    
 * => equals(): 두 인스턴스의 비교 결과 리턴
 *    - 기본: 같은 인스턴스이면 true, 아니면 false
 * 
 * => getClass(): 인스턴스가 어떤 클래스인지 그 정보를 리턴한다. 
 * 
 * => finalize(): 가비지 컬렉터가 인스턴스를 메모리에서 해제하기 전에 호출하는 메서드.
 *                이 메서드에서는 보통 인스턴스가 사용했던 자원을 해제시키는 작업을 한다.
 *                그러나 가비지 컬렉터가 언제 호출될 지 알 수 없고,
 *                프로그램이 종료될 때 까지 메모리가 부족하지 않다면 가비지 컬렉터가 
 *                실행되지 않기 때문에,
 *                프로그램이 종료될 때 까지 finalize()는 호출되지 않을 수도 있다.
 *                따라서 실무에서 인스턴스가 사용한 자원을 해제시키기 방법으로 
 *                finalize() 메서드 재정의를 사용하지 말라! 
 */
package step09;

public class Exam066_2 /*extends Object*/ {
  public static void main(String[] args) throws Exception {
    A r1 = new A();
    A r2 = new A();
    System.out.printf("r1.toString(): %s\n", r1.toString());
    System.out.printf("r1.hashCode(): %s\n", Integer.toHexString(r1.hashCode()));
    System.out.printf("r2.toString(): %s\n", r2.toString());
    System.out.printf("r2.hashCode(): %s\n", Integer.toHexString(r2.hashCode()));
    
    if (r1 == r2) { // 주소가 같은가?
      System.out.println("r1 == r2");
    }
    
    if (r1.equals(r2)) { // == 와 같다. 즉 인스턴스가 같은 지 검사한다.
      System.out.println("r1.equals(r2)");
    }
    
    Class c1 = r1.getClass(); // r1의 설계도(A 클래스) 주소
    Class c2 = r2.getClass(); // r2의 설계도(A 클래스) 주소 
    
    if (c1 == c2) { // c1 변수에 저장된 설계도 주소와 c2 변수에 저장된 설계도 주소가 같다.
      System.out.println("c1 == c2");
    }
    // 설계도 주소를 알고 있다면 설계도 정보를 빼낼 수 있다.
    System.out.println(c1.getName());
    
    // 설계도만 있다면 인스턴스를 생성할 수 있다.
    A r3 = (A)c1.newInstance();
    
  }

}







