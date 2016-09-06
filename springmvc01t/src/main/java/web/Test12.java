/* 주제: 페이지 컨트롤러에서 JSP로 값 전달하기
 * => 페이지 컨트롤러에서는 다양한 방법으로 JSP로 값을 전달할 수 있다.    
 */
package web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller   
@RequestMapping("/test12")
public class Test12 {
  
  // 방법1: 전통적인 방법. HttpServletRequest 보관소를 이용하는 방법
  @RequestMapping("/m1")
  public String m1(HttpServletRequest request) { 
    request.setAttribute("name", "홍길동");
    return "/test12.jsp";
  }
  
  //방법2: DispatcherServlet으로부터 새로 만든 Map 객체를 받아서, 그 객체에 저장한다.
  // 그러면 DispatcherServlet은 메서드 호출이 끝난 후 Map 객체에 저장된 것을 
  // 다시 ServletRequest 객체에 옮겨 담는다.
  // 결국 JSP는 이전처럼 ServletRequest 보관소에서 값을 꺼내면 된다.
  @RequestMapping("/m2")
  public String m2(Map<String,Object> map) { 
    map.put("name", "임꺽정");
    return "/test12.jsp";
  }
  
  //방법3: DispatcherServlet으로부터 새로 만든 Model 객체를 받아서, 그 객체에 저장한다.
  // 그러면 DispatcherServlet은 메서드 호출이 끝난 후 Model 객체에 저장된 것을 
  // 다시 ServletRequest 객체에 옮겨 담는다.
  // 결국 JSP는 이전처럼 ServletRequest 보관소에서 값을 꺼내면 된다.
  @RequestMapping("/m3")
  public String m3(Model model) { 
    model.addAttribute("name", "유관순");
    return "/test12.jsp";
  }
  
  //방법4: 리턴 값에 JSP에게 보낼 데이터를 담는다. 
  // 그러면 DispatcherServlet은 리턴 값을 분석하여 
  // 다시 ServletRequest 객체에 옮겨 담는다.
  // 결국 JSP는 이전처럼 ServletRequest 보관소에서 값을 꺼내면 된다.
  @RequestMapping("/m4")
  public ModelAndView m4() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("/test12.jsp");
    mv.addObject("name", "윤봉길");
    return mv;
  }
}










