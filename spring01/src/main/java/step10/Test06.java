/* 주제: 컬렉션 객체 주입 - Map<String,String> 객체 주입하기
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context06.xml");

    System.out.println(iocContainer.getBean("b1"));
  }

}








