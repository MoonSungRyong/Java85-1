/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법 - 객체에 아이디와 이름 모두 부여하기
 * => 설정 방법
 *    <bean id="이름" name="별명1 별명2 별명3" class="전체클래스명"/>
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context06.xml");
    
    //2) 객체의 이름 알아내기
    //=> id에 지정한 것은 이름이 되고, 
    //   name에 지정한 이름들은 별명이 된다.
    System.out.println("-------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
    //=> 나머지 이름은 별명으로 설정된다.
    System.out.println("-------------------------------");
    String[] aliases = iocContainer.getAliases("b1");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    
  }

}








