/* 주제: 팩토리 객체를 통해 인스턴스 준비하기 - FactoryBean 구현체의 이름
 * => 다른 개발자가 이해하기 쉽도록 클래스 이름 뒤에 FactoryBean을 붙여라.
 */
package step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context05.xml");

    System.out.println(iocContainer.getBean("p1"));
  }

}








