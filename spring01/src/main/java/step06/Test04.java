/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 스프링 IoC 컨테이너는 각 객체의 별명을 부여한다.
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    
    //2) 특정 객체의 별명을 알아내기
    System.out.println("------------------------------------------");
    String[] aliases = iocContainer.getAliases("step06.Book#0");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    
    System.out.println("------------------------------------------");
    aliases = iocContainer.getAliases("step06.Press#0");
    for (String alias : aliases) {
      System.out.println(alias);
    }
  }

}








