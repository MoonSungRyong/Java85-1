/* 주제: 생성자 호출하기 - c 네임스페이스를 사용하여 호출할 생성자 지정하기
 * => 네임스페이스 선언 : p 네임스페이스와 같다. 스키마 파일의 위치정보를 지정할 필요가 없다.
 *       xmlns:c="http://www.springframework.org/schema/c"
 *    
 * => 네임스페이스 사용법
      <bean ... c:파라미터명="값" c:파라미터명="값">
      
 */
package step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step08/application-context04.xml");
    
    //System.out.println(iocContainer.getBean("b1"));
  }

}








