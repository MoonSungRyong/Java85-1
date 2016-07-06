/* 주제: Iterator 패턴 활용 - Iterator 객체
 * Iterator 패턴
 * => 목록에서 값을 꺼내는 코드를 객체화시키는 설계 기법
 * => 개발자는 목록의 값을 어떻게 꺼내는지 알 필요가 없다.
 *    일관된 방법으로 값을 꺼낼 수 있다.
 */
package step09;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam072_1 {
  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("이순신");
    list.add("안중근");
    
    // 직접 값을 꺼내는 대신, 값을 꺼내주는 객체(Iterator)의 도움을 받자!
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) { // 꺼낼 값이 있냐?
      System.out.println(iterator.next()); // 값을 꺼내라!
    }
  }

}















