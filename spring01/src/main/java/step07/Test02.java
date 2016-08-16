/* 주제: 셋터 호출하기 - <value> 태그를 사용하여 프로퍼티 값 설정하기
 * => 설정법
 *    <bean ...>
 *      <property name="프로퍼티명">
 *        <value>값</value>
 *      </property>
 *    </bean>
 */
package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step07/application-context02.xml");
    
    // 프로퍼티 값 설정 규칙
    // => XML에 작성한 값은 String 이다.
    // => String ---> 원시타입(byte,short,int,long,float,double,boolean,char) 으로 자동으로 변환된다.
    //    그 밖에는 변환 오류 발생!
    //    해결책? String을 특정한 타입으로 바꿔주는 변환기를 설치해야 한다.
    System.out.println(iocContainer.getBean("b1"));
  }

}








