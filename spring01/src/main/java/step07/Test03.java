/* 주제: 셋터 호출하기 - <value> 태그와 type 속성
 * => 값의 타입을 지정하지 않으면, property 타입으로 자동 변환된다.
 *    물론 원시타입(byte,short,int,long,float,double,boolean,char)일 경우만 자동 변환된다.
 * => 설정법
 *    <bean ...>
 *      <property name="프로퍼티명">
 *        <value type="값의 타입을 지정">값</value>
 *      </property>
 *    </bean>
 */
package step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step07/application-context03.xml");
    
    // <value> 태그에 type 속성을 추가해도 이전 예제와 똑같다.
    System.out.println(iocContainer.getBean("b1"));
  }

}








