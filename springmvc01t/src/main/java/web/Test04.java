/* 주제: @RequestMapping 과 요청 파라미터
 * => 요청 파라미터의 존재 유무에 따라 호출 여부를 제어할 수 있다.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test04")
public class Test04 {
  
  @RequestMapping(value="/m1", params="name") // name이라는 파라미터가 있는 경우에 호출하라!
  public String m1() {
    return "/hello.jsp";
  }
  
  @RequestMapping(path="/m2", params="age") // age라는 파라미터가 있는 경우에 호출하라!
  public String m2() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/m3", params={"name","age"}) // name과 age 파라미터가 모두 있는 경우에 호출하라!
  public String m3() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/m4") // 파라미터의 이름을 지정하지 않으면 호출에 영향을 끼치지 않는다.
  public String m4() {
    return "/hello.jsp";
  }
  
}










