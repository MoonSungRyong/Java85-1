/* 주제: 객체 주입하기 - 의존 객체를 만들어 주입하기 
 * => 설정법
      <bean ...>
        <property name="파라미터명">
           <bean ...> ... </bean>
        </property>
      </bean>
 */
package step09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step09/application-context03.xml");
    
    Book b1 = (Book)iocContainer.getBean("b1");
    Book b2 = (Book)iocContainer.getBean("b2");
    
    System.out.println(b1);
    System.out.println(b2);
    
    if (b1.getPress() != b2.getPress())
      System.out.println("b1의 Press와 b2의 Press는 다르다.");
    
    System.out.println(b1.getPress());
    System.out.println(b2.getPress());
  }

}








