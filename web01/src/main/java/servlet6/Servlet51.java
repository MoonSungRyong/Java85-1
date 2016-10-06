/* 주제: 파일업로드3 */
package servlet6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/* 주제: 파일업로드 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/servlet51")
public class Servlet51 extends HttpServlet {
  @Override
  protected void doPost(
      HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException {
    
    //1) 멀티파트 데이터를 저장할 창고 준비
    DiskFileItemFactory factory = new DiskFileItemFactory();
    
    //2) HTTP 요청을 분석할 객체 준비
    //=> 이 객체는 HTTP 요청의 멀티파트 데이터를 분석하고 값을 저장할 때는 
    //   위에서 준비한 창고 객체를 사용한다. 
    ServletFileUpload upload = new ServletFileUpload(factory);
    
    //3) HTTP 요청 분석
    HashMap<String,Object> paramMap = new HashMap<>();
    try {
      List<FileItem> items = upload.parseRequest(request);
      
      //4) 멀티파트 각 항목의 데이터를 꺼내 임시 맵 객체에 보관한다.
      for (FileItem item : items) {
        if (item.isFormField()) { // 일반 데이터일 경우,
          paramMap.put(
              item.getFieldName(), // 파라미터 명 
              item.getString("UTF-8") // 파라미터 값
          );
        } else { // 파일일 경우,
          String newFilename = getNewFilename(item.getName());
          String path = this.getServletContext().getRealPath("/upload/" + newFilename);
          item.write(new File(path)); // path 경로에 파일을 저장한다.
          
          paramMap.put(
              item.getFieldName(), // 파라미터 명 
              //item.getName() // 파라미터 값(업로드 파일 명)
              newFilename  // 새 파일명
              //path // 실제 저장될 파일 전체 경로
          );
        }
      }
    } catch (Exception e) {
      throw new ServletException(e);
    }
    
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF=8'>");
    out.println("<title>파일업로드</title>");
    out.println("</head>");
    out.println("<body>");
    out.printf("name: %s<br>\n", paramMap.get("name")); 
    out.printf("age: %s<br>\n", paramMap.get("age"));
    out.printf("file1: %s<br>\n", paramMap.get("file1"));
    out.printf("file2: %s<br>\n", paramMap.get("file2"));
    out.printf("<img src='upload/%s' width='150'><br>\n", paramMap.get("file1")); 
    out.printf("<img src='upload/%s' width='150'><br>\n", paramMap.get("file2"));
    out.println("</body>");
    out.println("</html>");
  }
  
  int count = 0;
  private String getNewFilename(String originFilename) {
    if (count > 10000) {
      count = 0;
    }
    return System.currentTimeMillis() + "_" + (++count) + extractFileExt(originFilename);
  }
  
  private String extractFileExt(String filename) {
    return filename.substring(filename.lastIndexOf("."));
  }
}

/* 멀티파트 형식의 파라미터를 분석하는 라이브러리
 * => http://commons.apache.org/ 에서 FileUpload 라이브러리 다운로드
 */














