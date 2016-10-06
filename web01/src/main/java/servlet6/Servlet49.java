/* 주제: 파일업로드 */
package servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet49")
public class Servlet49 extends HttpServlet {
  @Override
  protected void doPost(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF=8'>");
    out.println("<title>파일업로드</title>");
    out.println("</head>");
    out.println("<body>");
    out.printf("name: %s<br>\n", request.getParameter("name")); 
    out.printf("age: %s<br>\n", request.getParameter("age"));
    out.printf("file1: %s<br>\n", request.getParameter("file1"));
    out.printf("file2: %s<br>\n", request.getParameter("file2"));
    out.println("</body>");
    out.println("</html>");
  }
}

/* POST 요청의 프로토콜 */
/* 파일 업로드는 다음과 같이 일반 POST 방식으로는 서버에 데이터를 전달할 수 없다.
 * 특별한 형식으로 가공해서 전달해야 한다.
 * 방법은? Servlet50.java 참조하라!
 */
/*
POST /web01/servlet49 HTTP/1.1
Host: localhost:8080
Content-Length: 53
Cache-Control: max-age=0
Origin: http://localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) ....
Content-Type: application/x-www-form-urlencoded
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,....
Referer: http://localhost:8080/web01/servlet49.html
Accept-Encoding: gzip, deflate
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

name=aaa&age=22&file1=photo01.jpeg&file2=photo02.jpeg
 */











