/* 주제: 생성자 호출하기 - 기본 설정법
 * => 설정법
      <bean ...>
        <constructor-arg value="생성자 파라미터 값"/>
      </bean>
      
      생성자에 전달하는 파라미터 개수에 따라 어떤 생성자를 호출할 지 결정한다.
      파라미터 개수가 같을 경우 String 타입의 생성자를 우선한다.
 */
package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step08/application-context01.xml");
    
    //System.out.println(iocContainer.getBean("b1"));
  }

}








