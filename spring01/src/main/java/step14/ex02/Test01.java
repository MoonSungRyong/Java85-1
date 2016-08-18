/* 주제: 스프링 애노테이션 다루기 - @Autowired의 위치
 * => 선언 위치
 * 1) 셋터 메서드 앞
 * 2) 셋터 메서드 없이 인스턴스 변수 앞
 * 
 *    
 */
package step14.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex02/application-context01.xml");

    System.out.println(iocContainer.getBean("book"));
  }

}








