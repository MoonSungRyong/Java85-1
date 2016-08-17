/* 주제: 객체 주입하기 - 기본 설정법
 * => 설정법1
      <bean ...>
        <property name="프로퍼티명" ref="객체명"/>
      </bean>
   
   => 설정법2
      <bean ...>
        <property name="프로퍼티명"><ref bean="객체명"/></property>
      </bean>   
   
   => 설정법3
      <bean ...>
        <property name="프로퍼티명" p:프로퍼티명-ref="객체명"/>
      </bean>   
      
   => 의존 객체를 주입할 경우, 객체 생성 순서 
      0) 객체 생성한다.
      1) 그 객체에 의존 객체를 주입하는 설정이 있는지 검사한다.
      2) 있다면, 의존 객체를 먼저 생성한다.
      3) 선언된 순서대로 셋터 메서드를 호출한다.   
 */
package step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step09/application-context01.xml");

    Book b1 = (Book)iocContainer.getBean("b1");
    Book b2 = (Book)iocContainer.getBean("b2");
    Book b3 = (Book)iocContainer.getBean("b3");
    
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    
    if (b1.getPress() == b2.getPress() && b1.getPress() == b3.getPress()) {
      System.out.println("b1, b2, b3 모두 같은 Press 객체를 주입한다.");
    }
  }

}








