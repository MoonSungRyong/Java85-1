/* 주제: 객체 생성 범위 - singleton
 * => Spring IoC 컨테이너는 기본으로 객체를 한 개만 생성한다.   
 */
package step11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step11/application-context01.xml");

    Press r1 = (Press)iocContainer.getBean("p1");
    Press r2 = (Press)iocContainer.getBean("p1");
    Press r3 = (Press)iocContainer.getBean("p1");
    
    if (r1 == r2 && r1 == r3) 
      System.out.println("r1, r2, r3는 모두 같은 객체이다.");
    
    Press r4 = (Press)iocContainer.getBean("p2");
    Press r5 = (Press)iocContainer.getBean("p2");
    Press r6 = (Press)iocContainer.getBean("p2");
    
    if (r4 == r5 && r4 == r6) 
      System.out.println("r4, r5, r6는 모두 같은 객체이다.");
  }

}








