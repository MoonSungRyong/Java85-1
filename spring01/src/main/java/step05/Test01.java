/* 주제: AnnotationConfigApplicationContext의 AppConfig 실무 설정법
 * => 실무에서는 @Component 애노테이션이 붙은 클래스를 찾아서 객체를 생성하기도 하고,
 *    @Component가 없는 오픈 소스 라이브러리에서 제공하는 클래스의 객체를 만들 때는
 *    직접 객체를 만드는 메서드를 정의하고 @Bean을 붙인다.
 */
package step05;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    // AppConfig 클래스는 설정 정보를 애노테이션 값으로 갖고 있다.
    AnnotationConfigApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    System.out.println(iocContainer.getBean(Book.class));
    System.out.println(iocContainer.getBean(Press.class));
    System.out.println(iocContainer.getBean(SqlSessionFactory.class));
  }

}







