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
    
    // 문제점: 특정 타입의 객체(의 주소)만 저장하고 싶은데 그것을 막을 방법이 없다.
    // 해결책: 어떤 타입의 객체를 저장할 지 지정하라!
    
    //2) 제네릭 사용 후
    //   => ArrayList에 담을 데이터의 타입을 제한한다.
    //ArrayList<String> names2 = new ArrayList<String>();
    ArrayList<String> names2 = new ArrayList<>(); // new 명령 다음에 타입 지정을 생략할 수 있다.
    names2.add("홍길동"); // 상수 스트링 객체의 주소를 저장
    names2.add(new String("임꺽정")); // 그냥 일반 스트링 객체의 주소를 저장
    //names2.add(new Integer(2)); // 컴파일 오류! 지정된 타입이 아니면 저장 불가!
    //names2.add(new Date()); // 컴파일 오류!
    
    // 제네릭 사용 이점:
    // => 지정된 타입 외에 다른 타입의 객체를 저장할 수 없다. 
    // => 그것도 실행 전 컴파일 단계에서 검사한다. => 오류를 쉽게 잡을 수 있다. 
    // => 개발자의 의도에 반하여 동작하는 것을 최소화 할 수 있다. => 프로그램 안정성이 좋아진다.
  }

}



















