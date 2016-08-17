/* 주제: 팩토리 객체를 통해 인스턴스 준비하기 - 파라미터가 있는 static 팩토리 메서드 사용하기
 * => <constructor-arg> 태그를 사용하여 파라미터 값을 전달한다.
 */
package step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context02.xml");

    System.out.println(iocContainer.getBean("p1"));
  }

}








