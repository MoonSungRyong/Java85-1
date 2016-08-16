/* 주제: 애노테이션을 통해 객체를 준비하기
 * => 스프링 설정 정보를 갖고 있는 외부 객체 사용하기
 */
package step04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    // AppConfig 클래스는 설정 정보를 애노테이션 값으로 갖고 있다.
    AnnotationConfigApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    //@Component 애노테이션이 붙은 클래스를 어떤 패키지에서 찾을 지 지정할 수 있다.
    iocContainer.scan("step04");
    
    Book b = (Book) iocContainer.getBean(Book.class);
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }

}







