package step04;

import org.springframework.context.annotation.Configuration;

// 스프링 IoC 컨테이너를 위한 설정 정보를 갖고 있는 객체
// => 애노테이션으로 설정 정보를 지정한다.

@Configuration // 이 클래스는 스프링 설정 정보를 갖고 있는 클래스임을 선언한다.
// @ComponentScan 애노테이션을 사용하는 대신 AnnotationConfigApplicationContext에서 직접
// 지정할 수 있다.
//@ComponentScan("step04") // @Component 애노테이션이 붙은 클래스를 찾아 객체를 생성할 것을 지정한다.
public class AppConfig {
  
}





