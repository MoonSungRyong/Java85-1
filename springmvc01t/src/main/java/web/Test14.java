/* 주제: 쿠키 만들기와 사용하기    
 */
package web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test14")
public class Test14 {
  
  // 쿠키를 클라이언트에게 보내는 것은 스프링 사용 전과 같다.
  @RequestMapping("/m1")
  public String m1(HttpServletResponse response) {
    Cookie cookie = new Cookie("name", "hong");
    response.addCookie(cookie);
    
    return "/hello.jsp";
  }
  
  // 클라이언트가 보낸 쿠키 꺼내기: @CookieValue 애노테이션을 사용하라!
  // => 만약 해당 이름의 쿠키가 HTTP 요청 헤더에 없다면 예외가 발생한다.
  // => 예외가 발생하지 않게 하려면 defaultValue 속성을 사용하여 기본 값을 지정하라!
  @RequestMapping("/m2")
  public String m2(@CookieValue(name="name", defaultValue="") String name) {
    System.out.println(name);
    
    return "/hello.jsp";
  }
  
}










