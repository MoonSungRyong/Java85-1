/* 주제: 커스텀 에디터 사용법 - 커스텀 에디터 만들기
 * 1) PropertyEditor 구현체를 작성한다.
 *    => MyDateEditor.java
 * 2) 스프링 IoC 컨테이너에 커스텀 에디터(custom editor)를 등록한다.
 */
package step13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step13/application-context02.xml");

    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    System.out.println("-------------------------------");
    
    System.out.println(iocContainer.getBean("b1"));
  }

}








