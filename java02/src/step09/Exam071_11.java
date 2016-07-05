/* 주제: Collection 클래스 - HashSet 사용법6
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

public class Exam071_11 {
  public static void main(String[] args) throws Exception {
    HashSet<Book5> set = new HashSet<>(); 
    
    //1) hashCode()와 equals() 모두 제대로 재정의 하였다.
    Book5 b1 = new Book5("자바프로그래밍", "홍길동", 500);
    Book5 b2 = new Book5("자바프로그래밍", "홍길동", 500);
    
    System.out.printf("b1: %d\n", b1.hashCode());
    System.out.printf("b2: %d\n", b2.hashCode());
    if (b1.equals(b2)) {
      System.out.println("b1.equals(b2)");
    }
    
    set.add(b1);
    set.add(b2);
    
    // 치명적인 문제가 해결되었는가? Yes!
    Book5 b3 = new Book5("스위프트프로그래밍", "임꺽정", 300);
    set.add(b3); 
                 
    System.out.println("---------------");
    for (Book5 book : set) {
      System.out.println(book);
    }
   
  }

}

/* 사용자가 만든 클래스에 대해 HashSet의 중복 제거 기능을 활용하려면,
 * 반드시 hashCode()와 equals()를 오버라이딩 하라!
 * => 즉 인스턴스는 다르지만 같은 내용을 갖고 있다면 해시 코드 값이 같아야 한다.
 * => 인스턴스가 달라도 내용이 같으면 equals()의 리턴 값이 true여야 한다.
 * 
 */














