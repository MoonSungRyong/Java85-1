/* 주제: 자바 원시 타입의 값으로 파라미터 받기
 * => 프런트 컨트롤러가, DispatcherServlet 클래스, 페이지 컨트롤러의 메서드를 호출할 때,
 *    요청 파라미터의 값으로 넘어온 문자열을 자바 원시 타입으로 자동 변환해 준다.
 * => 자바 원시 타입이 아닌 경우에는 별도의 커스텀 에디터를 설치해야 한다.  
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test07")
public class Test07 {
  
  // 파라미터 값이 넘어오면?
  // => 문자열이 해당 변수의 타입으로 자동 변환된다.
  // => 단 원시 타입(byte,short,int,long,float,double,boolean,char)에 대해서만 자동 변환한다.
  //
  // 파라미터의 값이 넘어오지 않았을 때?
  // => String 타입 : null 값을 가진다.
  // => int 타입 : null을 숫자로 변환하지 못해 예외 발생!
  // => boolean 타입 : null을 false로 변환한다.
  @RequestMapping("/m1")
  public String m1(
      String name, 
      int age,
      boolean gender) { 
    System.out.println(name);
    System.out.println(age);
    System.out.println(gender);
    return "/hello.jsp";
  }
  
  
}










