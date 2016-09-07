/* 주제: 세션 만들기와 사용하기    
 */
package web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller   
@RequestMapping("/test15")

//Model 객체에 저장된 값 중 세션에 보관해야 할 값의 이름을 설정한다.
@SessionAttributes({"email"})   
public class Test15 {
  
  // 테스트 목표: 
  // Model 객체에 값을 저장하면 ServletRequest 객체에 자동으로 복사된다는 것을 확인하기
  @RequestMapping("/m1")
  public String m1(Model model) {
    // Model 객체에 값을 저장하면, 메서드 호출이 끝난 후 JSP로 실행을 위임하기 전에  
    // 프런트 컨트롤러(DispatcherServlet)는 JSP가 사용할 수 있도록  
    // Model 객체에 저장된 값을 ServletRequest 객체에 복사한다. 
    model.addAttribute("name", "홍길동");
    
    // ServletRequest에 저장됐는지 확인하기 위해 JSP 쪽에서 출력해본다. 
    return "/test15.jsp";
  }
  /* 질문: 그냥 ServletRequest에 직접 값을 저장하면 될 것을 왜 Model 객체를 통해 값을 저장하는가?
   * => Model을 이용하면 그 이상의 것을 쉽게 처리할 수 있기 때문이다.
   * => 다음 메서드를 통해 살펴보라! 
   * 
   */
  
  // 테스트 목표: Model 객체를 통해 세션에 값을 저장하기 
  // => 방법: @SessionAttributes 애노테이션을 사용하여 Model 객체에 저장되는 값들 중에서
  //          어떤 값이 세션에 보관되어야 하는 지 설정한다.
  //          클래스 선언부에 이 애노테이션을 붙인다.
  // => 세션에 보관되더라도 ServletRequest에도 저장된다.
  @RequestMapping("/m2")
  public String m2(HttpSession session, Model model) {
    model.addAttribute("email", "hong@test.com");
    session.setAttribute("tel", "111-1111");
    
    return "/test15.jsp";
  }
  
  // 테스트 목표: 세션을 무효화시킨 후 JSP에서 세션 값을 출력
  @RequestMapping("/m3")
  public String m3(HttpSession session) {
    session.invalidate();
    
    // 세션을 무효화시켰는데도 불구하고, 
    // @SessionAttributes()로 지정된 email 값은 그대로 ServletRequest와 HttpSession에 유지된다.
    // 이유는?
    return "/test15.jsp";
  }
  // @SessionAttributes() 정확한 동작 원리
  // => 이 애노테이션에 지정된 값은 스프링에서 별도로 관리한다.
  // => JSP로 포워딩(인클루딩)할 때 마다 ServletRequest와 HttpSession에 보관시킨다.
  // => 따라서 오리지널 HttpSession 객체가 무효화된 후 새로 만들어지더라도,
  //    항상 @SessionAttributes 애노테이션에 지정된 값은 다시 자동으로 저장된다.
  // => 스프링에서 관리하는 세션 값들을 무효화시키는 방법은? 
  //    - 다음 메서드를 확인하라!
  
  // 테스트 목표: @SessionAttributes로 지정된 후, 스프링에서 별도로 관리되는 세션 값 무효화시키기
  @RequestMapping("/m4")
  public String m4(SessionStatus status) {
    // @SessionAttributes로 지정된 값을 모두 제거한다.
    status.setComplete(); 
    
    // 직접 HttpSession 객체에 저장된 값은 어떻게 되는가?
    // => 그대로 유지된다.
    return "/test15.jsp";
  }  
  
}

/* @SessionAttributes({name1, name2, name3, ...})
 * => Model 객체에 값을 저장하면, 이 애노테이션에 지정된 값들은 따로 별도의 저장소에 보관된다.
 * => JSP로 포워딩/인클루딩 할 때 마다 별도의 저장소에 보관된 값들은
 *    항상 ServletRequest, HttpSession 객체에 복사된다.
 * => 만약 SessionStatus를 setComplete()하게되면, 별도 저장소에 있는 값들을 모두 삭제한다.
 *    단, 마지막으로 ServletRequest에 복사해준다.
 *    
 * 결론!
 * => HttpSession 객체에 직접 저장한 값을 해제시키는 방법?
 *    - session.invalidate()를 호출하라!
 * => @SessionAttributes로 지정된 값을 해제시키는 방법?
 *    - status.setComplete()을 호출하라!   
 */











