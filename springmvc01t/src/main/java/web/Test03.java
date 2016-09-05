/* 주제: @RequestMapping 과 요청 방식(GET/POST 등)
 * => 요청 방식에 따라 호출 여부를 제어할 수 있다.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller   
@RequestMapping("/test03")
public class Test03 {
  
  @RequestMapping("/m1") // GET, POST 등 모든 요청 방식에 대응할 수 있다.
  public String m1() {
    return "/hello.jsp";
  }
  
  // URL을 지정할 때 value 또는 path로 지정할 수 있다.
  // 요청 방식을 지정할 때는 RequestMethod 객체의 상수 값을 이용한다.
  // => method 프로퍼티의 값은 배열이다. 그러나 값을 한 개 지정할 때는 중괄호{}를 생략할 수 있다.
  @RequestMapping(path="/m2", method=RequestMethod.GET) // GET 요청만 처리
  public String m2() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/m3", method=RequestMethod.POST) // POST 요청만 처리
  public String m3() {
    return "/hello.jsp";
  }
  
  // GET과 POST 요청을 모두 처리하고 싶다면, 중괄호를 이용하여 배열로 값을 지정하라!
  // 물론 method 프로퍼티 값을 지정하지 않으면, 모든 방식의 요청을 처리할 수 있다.
  @RequestMapping(value="/m4", method={RequestMethod.POST, RequestMethod.GET}) // GET, POST 요청 모두 처리
  public String m4() {
    return "/hello.jsp";
  }
}










