/* 주제: 쿠키 값 꺼내기 - path=/web01/servlet38  
 * => 이 서블릿과 같은 사용 범위를 갖는 쿠키만 꺼낼 수 있다.
 * => servlet37이 만든 쿠키는 다음과 같다
 *    name=xxx    --> /web01/test (사용 범위를 지정하지 않았기 때문에 servlet37의 경로와 같다)
 *    email=xxx   --> /web01/test
 *    age=xxx     --> /web01/test2
 * => 이 서블릿의 경로는 /web01 이기 때문에 
 *    servlet37이 보관한 쿠키들 중에서 어떤 것도 받을 수 없다.
 */
package servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet38")
public class Servlet38 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    
    //간단한 응답
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("클라이언트가 보낸 쿠키들:");
    
    if (cookies == null) 
      return;
    
    for (Cookie cookie : cookies) {
      out.printf("%s=%s\n", cookie.getName(), URLDecoder.decode(cookie.getValue(), "UTF-8"));
    }
  }
}








