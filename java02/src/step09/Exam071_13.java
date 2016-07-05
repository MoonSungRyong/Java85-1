/* 주제: Collection 클래스 - HashTable 사용법
 * => 값을 저장하는 규칙.
 *    - key 객체의 해시 코드를 이용하여 value를 저장하고 꺼낸다.
 *    - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야 한다.
 *    - key와 value에 null을 사용할 수 없다.
 *    - Thread-safe 하다. 멀티 스레드 환경을 지원한다.
 *      단 동기화 처리로 속도가 느리다.
 */
package step09;

import java.util.HashMap;
import java.util.Hashtable;

public class Exam071_13 {
  public static void main(String[] args) throws Exception {
    Hashtable<String, Book> map = new Hashtable<>();
    
    Book b1 = new Book("1111", "홍길동", 100);
    Book b2 = new Book("1111", "홍길동", 100);
    Book b3 = new Book("2222", "임꺽정", 300);
    Book b4 = new Book("3333", "유관순", 400);
    Book b5 = new Book("4444", "이순신", 500);
    
    map.put("aaa", b1);
    map.put("bbb", b1); // 같은 주소를 저장할 수 있다.
    map.put("ccc", b2); // 같은 주소도 저장하는데 인스턴스가 다르면 당연히 저장되지 않겠는가?
    map.put("ddd", b3);
    map.put("eee", b4);
    map.put("fff", b5);
    //map.put(null, b5);    // 실행 오류! key에 null을 허락하지 않는다.
    //map.put("hhh", null); // 실행 오류! value에 null을 허락하지 않는다.
    
    System.out.printf("aaa: %s\n", map.get("aaa").toString());
    System.out.printf("bbb: %s\n", map.get("bbb").toString());
    System.out.printf("ccc: %s\n", map.get("ccc").toString());
    System.out.printf("ddd: %s\n", map.get("ddd").toString());
    System.out.printf("eee: %s\n", map.get("eee").toString());
    System.out.printf("fff: %s\n", map.get("fff").toString());
    //System.out.printf("(null): %s\n", map.get(null).toString());
    //System.out.printf("hhh: %s\n", map.get("hhh"));
  }

}

/* HashMap vs HashTable
 * => HashMap은 key와 value에 null을 허락한다. Hashtable은 허락하지 않는다.
 * => HashMap은 동기화를 지원하지 않는다. Hashtable은 동기화를 지원한다. 
 *    그래서 Hashtable이 속도가 느리다. 
 *    동기화(Thread-safe)가 필요 없다면 HashMap을 사용하라!
 *
 */













