/* 주제: 설정 파일을 통해 객체를 준비하기
 */
package step04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step04/application-context.xml");
    
    Book b = (Book)iocContainer.getBean(Book.class);
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }

}







