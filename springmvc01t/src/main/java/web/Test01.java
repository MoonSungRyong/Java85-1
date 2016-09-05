/* 주제: @Controller와 @RequestMapping 애노테이션
 * 
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
public class Test01 {
  
  @RequestMapping("/hello")
  public String hello() {
    return "/hello.jsp";
  }
}
/*
@Controller
- 페이지 컨트롤러에 붙이는 애노테이션
- @Component와 마찬가지로 Spring IoC 컨테이너가 관리하는 객체에 대해 붙인다.
- 참고: @Service, @Repository도 있다.

@RequestMapping
- 요청 핸들러에 붙이는 애노테이션이다.
- 요청 핸들러(Request Handler)? 클라이언트 요청이 들어왔을 때 호출되는 메서드.
  즉 클라이언트 요청을 처리하는 메서드.
- 이 애노테이션은 클래스 앞에 붙여, 메서드에 붙은 애노테이션의 값과 함께 사용될 수 있다.
*/









