/* 주제: 스프링 애노테이션 다루기 - @Component 애노테이션
 * => 이 애노테이션 붙은 클래스에 대해 자동으로 객체를 생성한다.
 * => 단 이 애노테이션을 처리할 스프링 플러그인(객체)을 장착(생성)해야 한다.
 *    <context:component-scan base-package="클래스를 찾기 위해 탐색할 패키지명"/>
 *    이 태그는 <context:annotation-config/>의 기능을 포함하고 있기 때문에
 *    <context:annotation-config/> 태그를 생략해도 된다.
 * => 개발자는 객체를 생성하기 위해 스프링 설정 파일에
 *    <bean> 태그를 선언할 필요는 없다.
 */
package step14.ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step14/ex07/application-context01.xml");

    // 빈의 이름을 지정하지 않았기 때문에 타입으로 빈의 꺼낸다.
    System.out.println(iocContainer.getBean(Book.class));
    
    System.out.println("-----------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }

}








