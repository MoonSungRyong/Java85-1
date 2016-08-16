/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => 객체를 꺼낼 때는 별명이나 이름을 구분하지 않고 사용한다.
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context02.xml");
    
    System.out.println(iocContainer.getBean("step06.Book#0")); // 이름으로 찾아서 꺼내기
    System.out.println(iocContainer.getBean("step06.Book")); // 별명으로 찾아서 꺼내기
    
    if (iocContainer.getBean("step06.Book#0") == iocContainer.getBean("step06.Book"))
      System.out.println("같은 객체이다");
     
    
    // 타입으로 찾아서 꺼내기
    // => 예외 발생! 
    // => 이유? 한 개를 초과할 경우 예외가 발생한다.!
    System.out.println(iocContainer.getBean(Book.class)); // 예외 발생
  }

}








