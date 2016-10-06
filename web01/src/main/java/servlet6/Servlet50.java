/* 주제: 파일업로드2 */
package servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/* 주제: 파일업로드 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet50")
public class Servlet50 extends HttpServlet {
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

/* 멀티파트 POST 요청의 프로토콜
 * => 폼태그의 각 항목은 구분선을 기준으로 별도의 형식에 맞추어 서버에 보낸다. 
 * => 멀티파트로 형식으로 받은 데이터는 getParameter() 메서드를 사용하여 값을 꺼낼 수 없다.
 * => 멀티파트 형식을 분석하여 값을 추출해야 한다.
 *    개발자가 직접? 아니! 외부 라이브러리를 사용하라!
 */
/*
POST /web01/servlet50 HTTP/1.1
Host: localhost:8080
Content-Length: 14092
Cache-Control: max-age=0
Origin: http://localhost:8080
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1)....
Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryPABPATk7KlYJbnor
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,....
Referer: http://localhost:8080/web01/servlet50.html
Accept-Encoding: gzip, deflate
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4

------WebKitFormBoundaryPABPATk7KlYJbnor
Content-Disposition: form-data; name="name"

aaa
------WebKitFormBoundaryPABPATk7KlYJbnor
Content-Disposition: form-data; name="age"

222
------WebKitFormBoundaryPABPATk7KlYJbnor
Content-Disposition: form-data; name="file1"; filename="photo01.jpeg"
Content-Type: image/jpeg

실제파일데이터....
------WebKitFormBoundaryPABPATk7KlYJbnor
Content-Disposition: form-data; name="file2"; filename="photo02.jpeg"
Content-Type: image/jpeg

실제파일데이터...
------WebKitFormBoundaryPABPATk7KlYJbnor--
 */











