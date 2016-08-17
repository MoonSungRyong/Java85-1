/* 주제: 팩토리 객체를 통해 인스턴스 준비하기 - static 팩토리 메서드 사용하기
 * => 객체를 생성할 때 factory-method 속성에 스태틱 메서드 이름을 지정하면,
 *    그 메서드가 리턴한 값을 저장한다.
 */
package step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context01.xml");

    System.out.println(iocContainer.getBean("p0").getClass().getName());
    System.out.println(iocContainer.getBean("p1").getClass().getName());
  }

}








