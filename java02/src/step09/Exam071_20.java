/* 주제: Collection 클래스 - HashMap 사용법: 값 저장
 * => 값을 저장하는 규칙.
 *    - key 객체의 해시 코드를 이용하여 value를 저장하고 꺼낸다.
 *    - key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩해야 한다.
 *    - key와 value에 null을 사용할 수 있다.
 *    - Thread-safe 하지 않다. 멀티 스레드 환경에서 주의하여 사용하라!
 */
package step09;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Exam071_20 {
  public static void main(String[] args) throws Exception {
    HashMap<String, Object> window = new HashMap<>();
    
    window.put("a", new Book("1111", "홍길동", 100));
    window.put("a", 20); // autoboxing
    window.put("a", "문자열");
    window.put("a", true);
    window.put("a", new java.util.Date());
    
    System.out.println(window.get("a"));
    
    
  }
}















