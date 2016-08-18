/* 주제: 커스텀 에디터 사용법 - 커스텀 에디터 만들기2
 * => 문자열 ----> Press 객체
 */
package step13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step13/application-context03.xml");

    System.out.println(iocContainer.getBean("b1"));
  }

}








