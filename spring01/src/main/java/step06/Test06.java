/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 같은 타입의 객체가 여러 개 있을 때 별명은?
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test06 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context02.xml");
    
    //2) 같은 타입의 객체 이름 알아내기
    System.out.println("------------------------------------------");
    String[] aliases = iocContainer.getAliases("step06.Book#0");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    System.out.println("------------------------------------------");
    aliases = iocContainer.getAliases("step06.Book#1");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    System.out.println("------------------------------------------");
    aliases = iocContainer.getAliases("step06.Book#2");
    for (String alias : aliases) {
      System.out.println(alias);
    }
    
    /* 빈의 별명
     * => 같은 타입의 객체가 여러 개 있을 경우, 
     *    인덱스가 0인 객체만 자동으로 별명(전체 클래스명)을 부여한다.
     * => 나머지 객체는 별명을 부여하지 않는다.
     */
    
  }

}








