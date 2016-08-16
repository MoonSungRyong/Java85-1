/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 같은 타입의 객체 여러 개 생성하기
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context02.xml");
    
    //2) 같은 타입의 객체 이름 알아내기
    System.out.println("------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
  }

}








