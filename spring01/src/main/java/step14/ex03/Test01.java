/* 주제: 스프링 애노테이션 다루기 - @Autowired 처리기 등록하는 또 다른 방법
 * => 스프링 IoC 컨테이너에서는 플러그인을 등록할 때 
 *    <bean> 태그를 사용하여 객체를 생성한다.
 *    <bean class="org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor"/>
 * => 이것의 단축 설정법이 있다.
 *    <context:annotation-config/>
 *    이 태그를 선언하면 @Autowired 뿐만아니라 기타 다른 애노테이션을 처리하는 
 *    객체들도 생성한다.
 * 
 *    
 */
package step14.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex03/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
    System.out.println("-----------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}








