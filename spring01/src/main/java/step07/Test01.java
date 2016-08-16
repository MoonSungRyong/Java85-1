/* 주제: 셋터 호출하기 - 기본 설정법
 * => 설정법
 *    <bean ...>
 *      <property name="프로퍼티명" value="값"/>
 *    </bean>
 */
package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step07/application-context01.xml");
    
    System.out.println(iocContainer.getBean("b1"));
    System.out.println(iocContainer.getBean("b2"));
  }

}








