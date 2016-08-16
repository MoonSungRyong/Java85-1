/* 주제: 애노테이션을 통해 객체를 준비하기
 * => 스프링 설정 정보를 갖고 있는 외부 객체 사용하기
 */
package step02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    // AppConfig 클래스는 설정 정보를 애노테이션 값으로 갖고 있다.
    AnnotationConfigApplicationContext iocContainer = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    Book b = (Book) iocContainer.getBean(Book.class);
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
    
  }

}







