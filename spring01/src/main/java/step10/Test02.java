/* 주제: 컬렉션 객체 주입 - List 주입하기
 * => 배열 프로퍼티 처럼 <array> 또는 <list>를 사용할 수 있다.
   
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context02.xml");

    Book2 b1 = (Book2)iocContainer.getBean("b1");
    System.out.println(b1);
    System.out.println(iocContainer.getBean("b2"));
  }

}








