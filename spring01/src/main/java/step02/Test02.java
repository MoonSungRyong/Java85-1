/* 주제: IoC 컨테이너 사용법 - FileSystemXmlApplicationContext를 이용한 객체 생성
 */
package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new FileSystemXmlApplicationContext(
        "bin/step02/application-context.xml");
    
    Book b = (Book)iocContainer.getBean(Book.class);
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }

}







