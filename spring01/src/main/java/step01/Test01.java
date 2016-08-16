/* 주제: Spring IoC 컨테이너 준비하기 
 * => 설정 파일을 classpath에서 찾기.
 */
package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step01/application-context.xml");

  }

}
