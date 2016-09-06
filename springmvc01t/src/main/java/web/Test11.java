/* 주제: 요청 핸들러에서 기타 파라미터로 받을 수 있는 객체
 * => 요청 핸들러는 파라미터 값 외에 다음과 같은 객체들을 
 *    DispatcherServlet(프런트 컨트롤러)로부 받을 수 있다.
 * => 요청 핸들러가 받을 수 있는 객체
 *    HttpServletRequest, HttpServletResponse, HttpSession, Map 등
 * => ServletContext?
 *    - 파라미터로 받을 수 없고, 의존 객체로 주입받아야 한다.    
 */
package web;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test11")
public class Test11 {
  
  //단 ServletContext 객체는 의존 객체로 주입을 받아야 한다.
  //요청 핸들러에서 파라미터로 받을 수 없다.
  @Autowired
  ServletContext servletContext;
  
  @RequestMapping("/m1")
  public String m1(
      HttpServletRequest request, 
      HttpServletResponse response,
      HttpSession session) { 
    System.out.println(request);
    System.out.println(response);
    System.out.println(session);
    return "/hello.jsp";
  }
}










