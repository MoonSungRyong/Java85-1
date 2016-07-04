/* 주제: Date 클래스 - java.util.Calendar 소개
 */
package step09;

import java.util.Calendar;

public class Exam069_3 /*extends Object*/ {
  public static void main(String[] args) {
    //Calendar cal = new Calendar(); // proteced 로 접근을 접근을 제한한다.
                                   // 서브 클래스나 같은 패키지 소속 클래스가 아니라면,
                                   // 접근(호출, 실행)을 제한한다.
    
    // Calendar는 왜 생성자 호출을 제한했는가?
    // => 생성자를 호출할 수 없으면 "달력" 객체를 만들 수 없다.
    // => 이유? 
    //    - 달력 객체를 생성하는 코드가 복잡하기 때문이다.
    //    - 즉 개발자가 직접 달력을 생성하려면 System.currentTimeMillis()를 통해 
    //      현재 시간 정보를 얻어야 하고, 그 얻은 시간을 가지고 달력 객체를 생성해야 하는데,
    //      그러한 번거로움을 없애기 위해 별도로 스태틱 메서드를 제공해 준다.
    // 달력 객체를 어떻게 만드는가?
    // => Calendar에서 제공하는 스태틱 메서드를 호출하여 만든다.
    
    Calendar cal2 = Calendar.getInstance();
    Calendar cal3 = Calendar.getInstance();
    if (cal2 == cal3) {
      System.out.println("cal2 == cal3");
    }
    
  }

}


/*
 * 팩토리 메서드 설계 기법(factory method design pattern)?
 * => 인스턴스 생성과정이 복잡할 경우, 개발자의 부담을 덜어주고자
 *    인스턴스 생성과 관련된 코드를 메서드에 담아 제공한다.
 * => 그러면 개발자는 직접 new 명령을 사용하는 대신에,
 *    인스턴스 생성 코드가 저장된 메서드를 호출함으로써 인스턴스를 얻을 수 있다.
 * => 예)
 *    Calendar.getInstance();
 */



















