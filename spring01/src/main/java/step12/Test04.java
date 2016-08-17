/* 주제: 팩토리 객체를 통해 인스턴스 준비하기 - FactoryBean 구현체를 통해 객체 생성하기
 * => 주어진 클래스가 스프링에서 제공하는 FactoryBean 인터페이스의 구현체라면
 *    그 객체의 getObject() 리턴 값을 저장한다. 
 * => 왜 FactoryBean 구현체를 사용하는가?
 *    객체를 생성하는 XML 코드를 지정할 때 다른 일반 클래스와 사용법이 같아서 편리하다.
 */
package step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context04.xml");

    System.out.println(iocContainer.getBean("p1"));
  }

}








