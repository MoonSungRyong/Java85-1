/* 주제: Collection 클래스 - HashMap 사용법: 사용자 정의 key 클래스2
 * => 값을 저장하는 규칙.
 *    - key 객체의 해시 코드를 이용하여 value를 저장하고 꺼낸다.
 *    - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야 한다.
 *    - key와 value에 null을 사용할 수 있다.
 *    - Thread-safe 하지 않다. 멀티 스레드 환경에서 주의하여 사용하라!
 */
package step09;

import java.util.HashMap;

public class Exam071_16 {
  public static void main(String[] args) throws Exception {
    HashMap<MyKey2, Book> map = new HashMap<>();
    
    Book value1 = new Book("1111", "홍길동", 100);
    Book value2 = new Book("2222", "임꺽정", 300);
    Book value3 = new Book("3333", "유관순", 400);
    
    MyKey2 key1 = new MyKey2(10, 100);
    MyKey2 key2 = new MyKey2(20, 200);
    MyKey2 key3 = new MyKey2(23, 9893);
    
    //1) 값 저장: key 객체의 해시코드를 이용하여 value를 저장한다.
    map.put(key1, value1);
    map.put(key2, value2);
    map.put(key3, value3);
    
    //2) 값 꺼내기: key 객체의 해시코드를 이용하여 value를 꺼낸다.
    System.out.println(map.get(key1));
    System.out.println(map.get(key2));
    System.out.println(map.get(key3));
    
    //3) 다른 인스턴스로 값을 꺼낼 수 있을까?
    MyKey2 key4 = new MyKey2(10, 100);
    System.out.println(map.get(key4)); 
    
    //4) key 객체의 값과 해시코드를 살펴보자!
    System.out.println("------------------------");
    System.out.printf("%s --- %d\n", key1.toString(), key1.hashCode());
    System.out.printf("%s --- %d\n", key2.toString(), key2.hashCode());
    System.out.printf("%s --- %d\n", key3.toString(), key3.hashCode());
    System.out.printf("%s --- %d\n", key4.toString(), key4.hashCode());
  }

}















