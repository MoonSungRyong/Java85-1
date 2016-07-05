/* 주제: Collection 클래스 - ArrayList 사용법3
 * => 값을 저장하는 규칙.
 *    - null 값을 저장할 수 있다.
 *    - 같은 인스턴스 주소를 중복해 저장할 수 있다.
 *    - 꺼낼 때 저장된 순서대로 꺼낼 수 있다.
 */
package step09;

import java.util.ArrayList;
import java.util.Date;

public class Exam071_5 {
  public static void main(String[] args) throws Exception {
    ArrayList<String> names = new ArrayList<>(); 
    names.add("홍길동");
    names.add("홍길동");   // 위와 같은 객체(의 주소) 저장
    names.add(null);       // null 값 저장 가능
    names.add("임꺽정"); 
    
    // for (변수선언 : 배열 또는 Collection 타입의 객체) {...}
    //* 다음과 같이 신식 문법을 사용하여 ArrayList에서 값을 꺼낼 수 있다.
    for (String s : names) {
      System.out.println(s);
    }//*/
    
    // 구식 방법으로 값 꺼내기
    /*
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }
    */
    
  }

}



















