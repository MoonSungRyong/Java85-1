/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법 - 객체에 이름 부여하기
 * => 설정 방법
 *    <bean name="이름" class="전체클래스명"/>
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test09 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context04.xml");
    
    //2) 객체의 이름 알아내기
    //=> name 속성만 있으면 그 값을 이름으로 사용한다.
    System.out.println("-------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
    //=> 이름이 한 개일 때, 별명은 자동으로 설정되지 않는다.
    System.out.println("-------------------------------");
    String[] aliases = iocContainer.getAliases("b1");
    for (String alias : aliases) {
      System.out.println(alias);
    }
  }

}








