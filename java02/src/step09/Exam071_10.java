/* 주제: Collection 클래스 - HashSet 사용법5
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

public class Exam071_10 {
  public static void main(String[] args) throws Exception {
    HashSet<Book4> set = new HashSet<>(); 
    
    //1) hashCode()와 equals() 모두 재정의
    Book4 b1 = new Book4("자바프로그래밍", "홍길동", 500);
    Book4 b2 = new Book4("자바프로그래밍", "홍길동", 500);
    
    System.out.printf("b1: %d\n", b1.hashCode());
    System.out.printf("b2: %d\n", b2.hashCode());
    if (b1.equals(b2)) {
      System.out.println("b1.equals(b2)");
    }
    
    set.add(b1);
    set.add(b2);
    
    // 치명적인 문제
    Book4 b3 = new Book4("스위프트프로그래밍", "임꺽정", 300);
    set.add(b3); // b3가 b1,b2와 내용이 다름에도 불구하고 equals()와 hashCode()의 값이 같기 때문에
                 // b1과 같다고 간주되어 저장되지 않는다.
    // 해결책? 
    // => 인스턴스의 내용에 따라 다른 해시코드를 리턴해야 한다.
    // => equals()는 각 객체의 내용을 모두 비교하여 모든 항목의 값이 같을 때 true를 리턴하게 해야 한다.
    
    System.out.println("---------------");
    for (Book4 book : set) {
      System.out.println(book);
    }
  }

}
















