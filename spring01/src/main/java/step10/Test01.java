/* 주제: 컬렉션 객체 주입 - 배열 주입하기
 * => 설정법1
      <bean ...>
        <property name="프로퍼티명">
          <array>
            <bean .../>
            <bean .../>
            <bean .../>
          </array>
        </property>
      </bean>
      
   => 설정법2 : <array> 태그 대신 <list> 태그를 써도 된다.
      <bean ...>
        <property name="프로퍼티명">
          <list>
            <bean .../>
            <bean .../>
            <bean .../>
          </list>
        </property>
      </bean>   
   
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context01.xml");

    Book b1 = (Book)iocContainer.getBean("b1");
    System.out.println(b1);
    System.out.println(iocContainer.getBean("b2"));
  }

}








