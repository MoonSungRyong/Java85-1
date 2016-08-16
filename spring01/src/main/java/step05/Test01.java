/* 주제: 애노테이션을 통해 객체를 준비하기
 * => 스프링 설정 정보를 갖고 있는 외부 객체 사용하기
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







