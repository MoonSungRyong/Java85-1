/* 주제: 스프링 애노테이션 다루기 - @Autowired와 그 처리기
 * => AutowiredAnnotationBeanPostProcessor 클래스는 @Autowired 애노테이션을 처리해주는 클래스이다.
 *    즉 @Autowired 애노테이션을 처리하고 싶다면, 이 클래스의 객체를 생성해야 한다.
 *    
 */
package step14.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex01/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
  }

}








