/* 주제: 스프링 애노테이션 다루기 - @Autowired와 의존 객체 중복
 * => @Autowired 로 선언된 프로퍼티에 주입할 객체가 
 *    여러 개 있을 경우, 어떤 객체를 주입할 지 결정할 수 없기 때문에 
 *    오류 발생!
 * => 해결책?
 *    @Qualifier 애노테이션을 사용하여 어떤 객체를 주입할 지 지정하라!
 *    예) @Qualifier("객체명")
 */
package step14.ex05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex05/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
    
    System.out.println("-----------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}








