/* 주제: Collection 클래스 - HashSet 사용법4
 * => 사용자 정의 클래스를 이용하여 HashSet 저장 규칙을 이해하자!
 * => 값을 저장하는 규칙.
 *    - 집합을 본따 만든 객체이다. 즉 같은 값을 중복 저장하지 않는다.
 *    - 중복 여부 비교 방법?
 *      => hashCode()의 리턴 값이 같고,
 *      => equals()의 리턴 값이 true라면 같은 값으로 취급한다.
 *    - null 값을 저장할 수 있다.
 *    - 꺼낼 때 저장된 순서대로 꺼낼 수 없다.
 */
package step09;

import java.util.HashSet;

public class Exam071_9 {
  public static void main(String[] args) throws Exception {
    HashSet<Book3> set = new HashSet<>(); 
    
    //1) equals()만 재정의
    Book3 b1 = new Book3("자바프로그래밍", "홍길동", 500);
    Book3 b2 = new Book3("자바프로그래밍", "홍길동", 500);
    
    System.out.printf("b1: %d\n", b1.hashCode());
    System.out.printf("b2: %d\n", b2.hashCode());
    if (b1.equals(b2)) {
      System.out.println("b1.equals(b2)");
    }
    
    set.add(b1);
    set.add(b2);
    
    System.out.println("---------------");
    for (Book3 book : set) {
      System.out.println(book);
    }
  }

}
















