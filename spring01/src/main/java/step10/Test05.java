/* 주제: 컬렉션 객체 주입 - String과 원시타입 배열 주입하기
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context05.xml");

    System.out.println(iocContainer.getBean("b1"));
  }

}








