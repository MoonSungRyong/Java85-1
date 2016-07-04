/* 주제: Collection 클래스 - ArrayList 사용법2
 * => 제네릭 사용 전, 후
 * => 제네릭(generic)?
 *    => 다룰 데이터의 타입을 특정한 것으로 제한하는 문법
 */
package step09;

import java.util.ArrayList;
import java.util.Date;

public class Exam071_4 {
  public static void main(String[] args) throws Exception {
    //1) 제네릭(generic) 사용 전
    // => 저장할 데이터의 타입에 대해 제한을 두지 않는다.
    ArrayList names = new ArrayList();
    names.add("홍길동"); // String 인스턴스 (주소) 저장
    names.add(new Date()); // 헐.. 제한이 없으니 날짜 객체도 저장할 수 있구나!
    names.add(new Integer(20)); // 참나.. 별놈의 것도 다 저장하는 군.
    names.add(true);  //auto-boxing이 수행된다. names.add(new Boolean(true));와 같다. 
    
    
  }

}



















