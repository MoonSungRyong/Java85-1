/* 주제: GET과 POST, HEAD 등의 요청을 구분하여 메서드 호출한다. 
 * 
 */
package servlet2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HttpGenericServlet2 extends GenericServlet {
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    System.out.println("service(ServletRequest,ServletResponse)");
    // 파라미터로 넘어온 값을 원래의 타입으로 형변환한다.
    HttpServletRequest httpRequest = (HttpServletRequest)request;
    HttpServletResponse httpResponse = (HttpServletResponse)response;
    
    service(httpRequest, httpResponse);
  }
  
  public void service(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    switch (request.getMethod()) {
    case "GET": doGet(request, response); break;
    case "POST": doPost(request, response); break;
    case "HEAD": doHead(request, response); break;
    case "TRACE": doTrace(request, response); break;
    case "DELETE": doDelete(request, response); break;
    case "PUT": doPut(request, response); break;
    default: 
      doGet(request, response);
    }
  }

  private void doPut(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }

  private void doDelete(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }

  private void doTrace(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }

  private void doHead(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }

  private void doPost(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }

  private void doGet(HttpServletRequest request, HttpServletResponse response) {
    // TODO Auto-generated method stub
    
  }
}











