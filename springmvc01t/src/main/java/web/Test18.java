/* 주제: 파일 업로드
 * => test17.html 입력폼의 파일 업로드 처리
 * => test17result.jsp 는 파일업로드 결과 출력    
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
public class Test18 {
  
  @RequestMapping("/test18/aaa")
  public String aaa() {
    System.out.println("Test18.aaa()");
    return "/test18aaa.jsp";
  }
  
  @RequestMapping("/test18/bbb")
  public String bbb() {
    System.out.println("Test18.bbb()");
    return "/test18bbb.jsp";
  }
  
}










