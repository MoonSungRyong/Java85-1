/* 주제: 팩토리 객체를 통해 인스턴스 준비하기 - 인스턴스 팩토리 메서드 사용하기
 * => 공장 객체를 생성한 후, factory-bean 속성에 그 객체를 지정하라!
 */
package step12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step12/application-context03.xml");

    System.out.println(iocContainer.getBean("p1"));
  }

}








