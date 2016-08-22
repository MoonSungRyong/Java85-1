/* 주제: AbstractServlet 클래스를 사용하여 Servlet 인터페이스 간단히 구현하기
- Servlet 인터페이스의 네 개 메서드를 미리 구현한 AbstractServlet을 상속 받으면,
  이전 보다 더 쉽게 서블릿 클래스를 정의할 수 있다.
*/
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet06")
public class Servlet06 extends AbstractServlet {
  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("안녕하세요...Hello~~~^^");
  }
}












