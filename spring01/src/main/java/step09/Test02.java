/* 주제: 객체 주입하기 - 생성자 호출
 * => 설정법1
      <bean ...>
        <constructor-arg name="파라미터명" ref="객체명"/>
      </bean>
   
   => 설정법2
      <bean ...>
        <constructor-arg name="프로퍼티명"><ref bean="객체명"/></constructor-arg>
      </bean>   
   
   => 설정법3
      <bean ... c:파라미터명-ref="객체명"/>
   
   => 설정법4
      <bean ... c:인덱스번호-ref="객체명"/>
         
 */
package step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step09/application-context02.xml");
    
    System.out.println(iocContainer.getBean("b1"));
    System.out.println(iocContainer.getBean("b2"));
    System.out.println(iocContainer.getBean("b3"));
    System.out.println(iocContainer.getBean("b4"));
  }

}








