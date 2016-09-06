package web;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

/* Spring 4에서는 @ControllerAdvice라는 애노테이션을 이용하여
 * 페이지 컨트롤러과 협업하는 객체를 등록할 수 있다.
 * @ControllerAdvice 애노테이션을 사용하려면, 이 애노테이션을 처리하는 객체를 등록하라!  
 *       <mvc:annotation-driven/>
 */

@ControllerAdvice
public class MyControllerAdvice {
  CustomDateEditor customDateEditor;
  
  public MyControllerAdvice() {
    customDateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
  }
  
  @InitBinder
  public void initBinder(WebDataBinder binder, WebRequest request) {
    System.out.println("MyControllerAdvice.initBinder()");  
    
    // 커스텀 에디터를 지정하여 문자열 파라미터 값을 특정 객체로 변환하기: 2.5 <= 
    //binder.registerCustomEditor(java.util.Date.class, customDateEditor);
    
    // 커스텀 포맷터를 이용하여 문자열 파라미터 값을 특정 객체로 변환하기 : 4.2 <=
    binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    
  }
}



