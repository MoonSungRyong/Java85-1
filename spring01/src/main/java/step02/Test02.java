/* 주제: 설정 파일을 통해 객체를 준비하기
 */
package step02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new FileSystemXmlApplicationContext(
        "bin/step02/application-context.xml");
    
    Book b = (Book)iocContainer.getBean("b1");
    Press p = (Press)iocContainer.getBean("p1");
    
    System.out.println(b);
    System.out.println(p);
  }

}







