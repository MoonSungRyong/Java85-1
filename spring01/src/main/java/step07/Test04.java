/* 주제: 셋터 호출하기 - <value> 태그와 p 네임스페이스
 * => p 네임스페이스를 사용하여 <bean> 태그의 속성으로 프로퍼티 값을 설정할 수 있다.
 * => p 네임스페이스 선언
        <beans ...
          xmlns:context="http://www.springframework.org/schema/context"
          xmlns:p="http://www.springframework.org/schema/p"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
              http://www.springframework.org/schema/beans/spring-beans.xsd
              http://www.springframework.org/schema/context
              http://www.springframework.org/schema/context/spring-context.xsd">
              
      XML에서 네임스페이스를 선언할 경우, 반드시 그 네임스페이스의 규칙을 지정한
      스키마 파일의 경로를 지정해야 한다.
      예를 들면, context 네임스페이스 경우이다.
      => 네임스페이스 선언
           xmlns:context="http://www.springframework.org/schema/context"
      => 네임스페이스 안에 어떤 태그가 들어 있는지 지정한 스키마 파일의 위치 정보
           xsi:schemaLocation="
              ...
              http://www.springframework.org/schema/context
              http://www.springframework.org/schema/context/spring-context.xsd"
      
      그러나, p 네임스페이스의 경우, 네임스페이스의 스키마 파일을 위치를 지정할 필요는 없다.
      그래서 그냥 네임스페이스의 별명만 지정한다.
           xmlns:p="http://www.springframework.org/schema/p"
           
 * => 사용법
 *    <bean ... p:프로퍼티명="값" p:프로퍼티명="값" ... />
 */
package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step07/application-context04.xml");
    
    // <bean> 태그와 p 네임스페이스를 사용하여 프러퍼티 값 설정하기
    System.out.println(iocContainer.getBean("b1"));
  }

}








