/* 주제: @RequestMapping 애노테이션과 URL
 * 
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test02")
public class Test02 {
  
  @RequestMapping   // url => /test02.do
  public String m0() {
    return "/hello.jsp";
  }
  
  @RequestMapping("/m1") // url => /test02/m1.do
  public String m1() {
    return "/hello.jsp";
  }
  
  @RequestMapping("/aaa/m2") // url => /test01/aaa/m2.do
  public String m2() {
    return "/hello.jsp";
  }
  
  @RequestMapping("/aaa/bbb/m3") // url => /test01/aaa/bbb/m3.do
  public String m3() {
    return "/hello.jsp";
  }
}
/*
@RequestMapping 과 URL
- 클래스에 @RequestMapping 애노테이션이 있다면,
   클래스에 지정된 URL과 메서드에 지정된 URL을 합쳐 사용한다.
- 예)
@RequestMapping(url1)
class Controller {

  @RequestMapping(url2)
  String handler() {
    ...
  }
  ...
}
=> URL = url1 + url2

*/









