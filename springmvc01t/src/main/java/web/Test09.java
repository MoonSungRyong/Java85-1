/* 주제: 커스텀 에디터 사용
 * => 요청 핸들러의 변수가 원시 타입이 아닌 경우, 변환 오류가 발생한다.
 *    이유?
 *    - 문자열을 원시 타입의 값으로 변환하는 객체는 기본으로 DispatcherServlet에 내장되어 있다.
 *    - 그러나 그 밖의 타입으로 변환하는 객체는 내장되어 있지 않다.
 *    - 따라서 변환 오류가 발생하는 것이다.
 * => 해결책!
 *    - 문자열을 특정 타입으로 변환시켜주는 객체(커스텀 에디터)를 등록하면 된다.
 */
package web;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test09")
public class Test09 {
  
  // 요청 파라미터 값(문자열)을 String 변수에 저장하는 것은 아무런 문제가 없다.
  @RequestMapping("/m1")
  public String m1(String date) { 
    System.out.println(date);
    return "/hello.jsp";
  }
  
  @RequestMapping("/m2")
  public String m2(java.util.Date date) { 
    System.out.println(date);
    return "/hello.jsp";
  }
  
  // 페이지 컨트롤러에 요청이 들어올 때 마다 요청 파라미터의 값을 처리할 메서드를 추가한다.
  // => 메서드의 시그너처는 다음과 같아야 한다.
  //    void 메서드명(WebDataBinder) {...}
  // => 그리고 이 메서드에 딱지(@InitBinder)를 붙여야 한다.
  //    그러면 프런트 컨트롤러(DispatcherServlet)가 페이지 컨트롤러의 메서드를 호출하기 전에
  //    이 딱지가 붙은 메서드를 먼저 호출할 것이다.
  //    일종의 필터처럼 작업을 수행한다.
  
  @InitBinder // 이 메서드가 요청을 처리하기 전에 호출해야 하는 메서드라고 알리는 역할을 한다.
  public void initBinder(WebDataBinder binder) {
    System.out.println("initBinder()");  
    
    //binder에 커스텀 에디터를 등록한다.
    binder.registerCustomEditor(
        java.util.Date.class, // 변수의 타입 
        new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true) //문자열을 java.util.Date 객체로 만들어 줄 변환기
    );
  }
  
}










