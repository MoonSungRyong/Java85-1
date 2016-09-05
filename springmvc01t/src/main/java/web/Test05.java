/* 주제: @RequestMapping 과 요청 헤더
 * => 요청 헤더의 존재 유무에 따라 호출 여부를 제어할 수 있다.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test05")
public class Test05 {
  
  @RequestMapping(value="/m1", headers="myheader1") // 요청 헤더에 myheader1이 있다면 호출하라!
  public String m1() {
    return "/hello.jsp";
  }
  
  @RequestMapping(path="/m2", headers="myheader2") // 요청 헤더에 myheader2가 있다면 호출하라!
  public String m2() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/m3", headers={"myheader1","myheader2"}) // 요청 헤더에 myheader1, myheader2가 있다면 호출하라!
  public String m3() {
    return "/hello.jsp";
  }
  
  @RequestMapping(value="/m4") // 헤더 이름을 지정하지 않으면 호출에 영향을 끼치지 않는다.
  public String m4() {
    return "/hello.jsp";
  }
  
}










