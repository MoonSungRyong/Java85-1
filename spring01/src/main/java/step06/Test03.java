/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 객체 타입이 아닌 이름으로 객체 꺼내기
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    
    //2) 이름으로 객체(bean 이라고도 한다) 꺼내기
    System.out.println(iocContainer.getBean("step06.Book#0"));
    System.out.println(iocContainer.getBean("step06.Press#0"));
    
    //3) 존재하지 않는 이름의 객체를 꺼내려 한다면 예외 발생!
    System.out.println(iocContainer.getBean("step06.Book#1")); // 예외!
  }

}








