/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법 - 여러 개의 이름 부여하기2
 * => 공백 외에 콤마나 세미콜론 사용 가능하다.
 *    <bean name="이름1 이름2 이름3" class="전체클래스명"/>
 *    <bean name="이름1,이름2,이름3" class="전체클래스명"/>
 *    <bean name="이름1;이름2;이름3" class="전체클래스명"/>
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test12 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context07.xml");
    
    // 이름 알아내기
    System.out.println("-------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
    // bx 객체의 모든 별명 알아내기
    System.out.println("-------------------------------");
    String[] aliases = iocContainer.getAliases("bx");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    
  }

}








