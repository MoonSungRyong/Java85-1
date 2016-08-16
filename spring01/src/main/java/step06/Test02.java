/* 주제: ClassPathXmlApplicationContext와 XML 파일을 설정하는 방법
 * => Spring IoC 컨테이너가 생성한 객체 목록 보기
 */
package step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    //1) Spring IoC 컨테이너를 이용하여 객체 생성하기
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step06/application-context01.xml");
    
    System.out.printf("객체 개수: %d\n", iocContainer.getBeanDefinitionCount());
    
    System.out.println("객체 이름들");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }
    
    /* 객체 이름?
     * => 전체클래스명#인덱스번호
     * 
     * Fully-Qualified Class Name(FQName=QName)
     * => 패키지 이름을 포함한 전체 클래스명 
     */
  }

}








