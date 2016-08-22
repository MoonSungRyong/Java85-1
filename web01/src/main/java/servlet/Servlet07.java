/* 주제: GenericServlet 추상 클래스를 상속 받아 서블릿 구현하기
- 이전 예제에서 만든 AbstractServlet 추상 클래스와 같은 기능을 하는 것이
  GenericServlet 추상 클래스이다.
- 그럼 왜 AbstractServlet 클래스를 만들었나요?
  => GenericServlet 클래스가 내부적으로 뭐하는 클래스인지 보여주기 위해서이다.
*/
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet07")
public class Servlet07 extends GenericServlet {
  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("안녕하세요...Hello~~~^^");
  }
}












