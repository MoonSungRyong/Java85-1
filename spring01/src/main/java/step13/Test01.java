/* 주제: 커스텀 에디터 사용법 - 직접 String ---> java.util.Date 바꾸기
 */
package step13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step13/application-context01.xml");

    System.out.println(iocContainer.getBean("b1"));
  }

}








