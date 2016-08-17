/* 주제: 컬렉션 객체 주입 - 기존 객체 주입하기
 * => <ref> 태그 등을 사용하면 기존 객체를 주입할 수 있다.
   
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context04.xml");

    System.out.println(iocContainer.getBean("b1"));
    System.out.println(iocContainer.getBean("b2"));
  }

}








