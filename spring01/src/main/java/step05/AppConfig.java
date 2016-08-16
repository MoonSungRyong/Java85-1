package step05;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("step05") // 객체 생성이 복잡하지 않은 경우는 이렇게 @Component 애노테이션이 붙은 
                         // 클래스를 찾아서 객체를 생성하면 된다.
public class AppConfig {
  
  // 그런데 SqlSessionFactory 처럼 객체 생성과정이 복잡한 경우에는
  // 다음과 같이 메서드를 통해 객체를 생성하여 등록한다.
  // => 즉 @ComponentScan 애노테이션을 통해 만들 수 없는 객체는 다음과 같이
  //    메서드를 통해 직접 객체를 생성해야 한다.
  @Bean
  SqlSessionFactory createSqlSessionFactory() throws Exception {
    return new SqlSessionFactoryBuilder().build(
        Resources.getResourceAsStream("step05/mybatis-config.xml"));
  }
  
}





