/* 주제: Collection 클래스 - HashMap 사용법: key 클래스
 * => 값을 저장하는 규칙.
 *    - key 객체의 해시 코드를 이용하여 value를 저장하고 꺼낸다.
 *    - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야 한다.
 *    - key와 value에 null을 사용할 수 있다.
 *    - Thread-safe 하지 않다. 멀티 스레드 환경에서 주의하여 사용하라!
 */
package step09;

import java.util.HashMap;

public class Exam071_14 {
  public static void main(String[] args) throws Exception {
    HashMap<String, Book> map = new HashMap<>();
    
    Book value1 = new Book("1111", "홍길동", 100);
    Book value2 = new Book("2222", "임꺽정", 300);
    Book value3 = new Book("3333", "유관순", 400);
    
    String key1 = new String("aaa");
    String key2 = new String("bbb");
    String key3 = new String("ccc");
    
    //1) 값 저장: key 객체의 해시코드를 이용하여 value를 저장한다.
    map.put(key1, value1);
    map.put(key2, value2);
    map.put(key3, value3);
    
    //2) 값 꺼내기: key 객체의 해시코드를 이용하여 value를 꺼낸다.
    System.out.println(map.get(key1));
    System.out.println(map.get(key2));
    System.out.println(map.get(key3));
    
    //3) 인스턴스가 다르더라도 같은 해시코드를 갖고 있다면 key로 사용할 수 있다.
    String key4 = new String("aaa");
    System.out.println(map.get(key4)); //저장은 key1으로 했고, 꺼낼 때는 key4로 꺼냈다.
  }

}















