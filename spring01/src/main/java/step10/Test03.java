/* 주제: 컬렉션 객체 주입 - Map 주입하기
 * => <map> 태그와 <entry> 태그를 사용한다.
   
 */
package step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step10/application-context03.xml");

    System.out.println(iocContainer.getBean("b1"));
  }

}








