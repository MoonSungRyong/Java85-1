/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법 - 객체에 이름을 두 개 이상 부여하기
 * => 설정 방법
 *    <bean name="이름" class="전체클래스명"/>
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context05.xml");
    
    //2) 객체의 이름 알아내기
    //=> name 속성만 있고, 이름이 여러 개일 경우,
    //   첫 번째 이름은 객체의 이름으로 사용하고, 
    //   나머지 이름은 별명으로 사용한다.
    System.out.println("-------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
    //=> 나머지 이름은 별명으로 설정된다.
    System.out.println("-------------------------------");
    String[] aliases = iocContainer.getAliases("b2");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    
    // 중요!
    // => 별명이든 이름이든 객체를 찾을 때는 같다!
    Book r1 = (Book)iocContainer.getBean("bx");
    Book r2 = (Book)iocContainer.getBean("by");
    Book r3 = (Book)iocContainer.getBean("bz");
    Book r4 = (Book)iocContainer.getBean("b1");
    
    if (r1 == r2 && r1 == r3 && r1 == r4) 
      System.out.println("같다!");
    
  }

}








