/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 객체 생성 태그 
 *   <bean class="패키지명을 포함한 클래스명"></bean>
 *   <bean class="패키지명을 포함한 클래스명"/>
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    
    //2) Spring IoC 컨테이너에서 객체 꺼내기
    //=> 꺼낼 객체의 타입을 지정한다.
    Book b = (Book)iocContainer.getBean(Book.class);
    Press p = (Press)iocContainer.getBean(Press.class);
    
    System.out.println(b);
    System.out.println(p);
  }

}








