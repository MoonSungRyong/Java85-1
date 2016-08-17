/* 주제: 생성자 호출하기 - 파라미터 타입과 인덱스를 지정하여 호출할 생성자 선택하기
 * => 설정법
      <bean ...>
        <constructor-arg type="파라미터 타입" value="생성자 파라미터 값" index="인덱스번호"/>
      </bean>
      
      파라미터의 타입과 인덱스를 지정하면 파라미터의 순선와 타입이 일치하는 생성자를 먼저 찾는다.
      
 */
package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step08/application-context03.xml");
    
    //System.out.println(iocContainer.getBean("b1"));
  }

}








