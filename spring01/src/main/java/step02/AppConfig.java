package step02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 IoC 컨테이너를 위한 설정 정보를 갖고 있는 객체
// => 애노테이션으로 설정 정보를 지정한다.

@Configuration // 이 클래스는 스프링 설정 정보를 갖고 있는 클래스임을 선언한다.
public class AppConfig {
  
  @Bean  // 이 메서드는 자바 객체를 리턴하는 메서드임을 선언한다. 
         // 이 애노테이션이 붙은 메서드는 AnnotationConfigApplicationContext 객체가 호출한다.
         // 그리고 이 메서드가 리턴한 객체를 보관한다.
  Book createBook() { // 메서드의 이름은 상관없다.
    System.out.println("createBook()");
    Book b = new Book();
    b.setTitle("자바프로그래밍");
    b.setAuthor("홍길동");
    return b;
  }
  
  @Bean  // 이 메서드는 자바 객체를 리턴하는 메서드임을 선언한다.
  Press generatePress() { // 메서드의 이름은 상관없다.
    System.out.println("generatePress()");
    Press p = new Press();
    p.setName("비트출판사");
    p.setTel("1111-1111");
    return p;
  }
}





