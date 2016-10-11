/* 주제: AOP 객체
 */
package web;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 이 클래스가 특정 메서드 그룹에 대해 필터 작업을 수행하는 클래스임을 지정한다.   
public class Test19AOP {
  public Test19AOP() {
    System.out.println("Test19AOP 객체 생성됨");
  }
  
  /* m1() 메서드를 필터로서 어떤 위치에 삽입할 것인지 지정한다.*/
  @Before("execution(* web.Test19Dao.insert())")
  public void m1() {
    System.out.println("Test19AOP.m1()");
  }
  
  @After("execution(* web.Test19Dao.insert())")
  public void m2() {
    System.out.println("Test19AOP.m2()");
  }
  
  @Before("execution(* web.Test19Dao.*())")
  public void m3() {
    System.out.println("Test19AOP.m3()");
  }
  
  @Before("execution(* web.Test19Dao.select*())")
  public void m4() {
    System.out.println("Test19AOP.m4()");
  }
  
}









