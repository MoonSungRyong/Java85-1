/* 주제: 다른 페이지 컨트롤러가 만든 값을 사용하기
 * => Test15.java와 연계하여 테스트하기 위함.    
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test16")
//@SessionAttributes({"email"})   
public class Test16 {
  
  @RequestMapping("/m1")
  public String m1() {
    return "/test15.jsp";
  }  
  
}


