/* 주제: 생성자 호출하기 - 파라미터 타입 지정하여 호출할 생성자 선택하기
 * => 설정법
      <bean ...>
        <constructor-arg type="파라미터 타입" value="생성자 파라미터 값"/>
      </bean>
      
      파라미터의 타입을 지정하면 그 타입과 일치하는 생성자를 먼저 찾는다.
      만약 파라미터의 순서는 다르지만 그 타입과 일치하는 생성자가 여러 개 있을 경우,
      클래스 정의할 때 선언된 생성자의 순서에 영향을 받는다.
      => 결론: 생성자가 선언된 순서에 영향을 받지 않으려면 
               파라미터의 인덱스를 지정하라!
      
 */
package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step08/application-context02.xml");
    
    //System.out.println(iocContainer.getBean("b1"));
  }

}








