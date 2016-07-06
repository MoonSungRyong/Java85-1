/* 주제: Collection 클래스 - HashMap 사용법: 값 꺼내기 방법 2
 * => 값을 저장하는 규칙.
 *    - key 객체의 해시 코드를 이용하여 value를 저장하고 꺼낸다.
 *    - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야 한다.
 *    - key와 value에 null을 사용할 수 있다.
 *    - Thread-safe 하지 않다. 멀티 스레드 환경에서 주의하여 사용하라!
 */
package step09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam071_18 {
  public static void main(String[] args) throws Exception {
    HashMap<String, Book> map = new HashMap<>();
    
    Book value1 = new Book("1111", "홍길동", 100);
    Book value2 = new Book("2222", "임꺽정", 300);
    Book value3 = new Book("3333", "유관순", 400);
    
    map.put("aaa", value1);
    map.put("bbb", value2);
    map.put("ccc", value3);
   
    // 맵에 저장된 값을 꺼내야 되는데, key를 모른다고 가정하자!
    //1) key 목록을 먼저 알아내야 한다.
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();
    
    //2) key 목록에서 key을 꺼내고, 그 key를 사용하여 맵에서 값을 꺼낸다.
    while (iterator.hasNext()) {
      System.out.println(map.get(iterator.next()));
    }
  }
}















