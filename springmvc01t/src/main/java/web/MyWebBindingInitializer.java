package web;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class MyWebBindingInitializer implements WebBindingInitializer {
  CustomDateEditor customDateEditor;
  
  public MyWebBindingInitializer() {
    customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
  }
  
  @Override
  public void initBinder(WebDataBinder binder, WebRequest request) {
    System.out.println("MyWebBindingInitializer.initBinder()");  
    binder.registerCustomEditor(java.util.Date.class, customDateEditor);
  }
}

/* 이 객체를 스프링 설정 파일에 등록해야 한다.
=> Spring 2.5 방식
<bean class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter">
    <property name="cacheSeconds" value="0"/>
    <property name="webBindingInitializer">
        <bean class="web.MyWebBindingInitializer"/>
    </property>
</bean> 

=> Spring 3.2 방식
1) MVC 관련 애노테이션을 다룰 객체를 등록해야 한다.
<mvc:annotation-driven/>  

2) 전역에서 사용할 수 있도록 커스텀 에디터를 등록한다.
<bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
    <property name="order" value="0" /> <== 주의! 적용 순서를 최우선으로 해야 한다.
    <property name="cacheSeconds" value="0"/>
    <property name="webBindingInitializer">
        <bean class="web.MyWebBindingInitializer"/>
    </property>
</bean> 


 */




