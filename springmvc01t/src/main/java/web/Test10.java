/* 주제: 커스텀 에디터 사용2
 * => 각각의 페이지 컨트롤러마다 커스텀 에디터를 등록한다면 번거롭고 낭비적이다.
 *    요청을 처리하는 전역에서 사용할 커스텀 에디터를 등록하라!
 * => 방법
 *    - WebBindingInitializer 구현체를 만들어 등록하라! 
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test10")
public class Test10 {
  
  @RequestMapping("/m1")
  public String m1(java.util.Date date) { 
    System.out.println(date);
    return "/hello.jsp";
  }
}










