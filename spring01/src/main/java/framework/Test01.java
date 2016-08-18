package framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {
    /* 일반적인 객체 사용 방법 */
    /*
    BitMotor motor = new BitMotor();
    Car c = new Car();
    c.setMotor(motor);
    c.run();
    */
    
    /* IoC(역제어, 제어권의 역전) 방법
     * => 객체의 생성과 의존 객체 설정을 외부에게 맡긴다.
     */
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "framework/application-context01.xml");
    
    Car car = (Car)iocContainer.getBean("car");
    car.run();
  }

}

/* 위 예제는 프레임워크의 내부 구동 원리를 보여주고 있다.
 * => 자동차에 모터나 센서를 꼽는 것에 따라 동작이 달라진다.
 * => 모터를 꼽으면 모터를 실행할 것이고,
 *    센서를 꼽으면 센서를 실행할 것이다.
 * 
 * 스프링 프레임워크가 이와 같은 방식으로 동작한다.
 * 스프링 프레입워크는 기본 골격을 갖추고 있다.
 * 만약 추가 기능이 필요하다면 스프링에서 제안하는 규칙에 따라 
 * 객체를 만들어 꼽으면 된다.
 * 또는 스프링에서 제공하는 클래스를 꼽으면 된다.
 * 이렇게 클래스를 꼽으면 해당 기능이 활성화될 것이다.
 * 
 */







