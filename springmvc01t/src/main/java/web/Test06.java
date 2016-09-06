/* 주제: 파라미터 값 받기
 * => @RequestParam 애노테이션을 사용하여 파라미터 값을 받을 수 있다.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   
@RequestMapping("/test06")
public class Test06 {
  
  //기본이 필수 입력이다. 값이 없으면 예외 발생!
  @RequestMapping("/m1")
  public String m1(
      @RequestParam("name") String name, 
      @RequestParam("age") String age) { 
    System.out.println(name);
    System.out.println(age);
    return "/hello.jsp";
  }
  
  //선택 값으로 설정하기. 값이 없으면 null이 넘어온다.
  @RequestMapping("/m2")
  public String m2(
      @RequestParam(value="name", required=false) String name, 
      @RequestParam(value="age", required=false) String age) { 
    System.out.println(name);
    System.out.println(age);
    return "/hello.jsp";
  }
  
  // 값이 없을 때 기본으로 사용할 값 설정하기 
  @RequestMapping("/m3")
  public String m3(
      @RequestParam(value="name", required=false, defaultValue="홍길동") String name, 
      @RequestParam(value="age", required=false, defaultValue="20") String age) { 
    System.out.println(name);
    System.out.println(age);
    return "/hello.jsp";
  }
  
  //요청 파라미터 이름과 메서드의 파라미터 변수 이름이 같다면 @RequestParam을 생략할 수 있다.
  //생략한다면, @RequestParam(required=false)와 같다.
  @RequestMapping("/m4")
  public String m4(
      String name, 
      String age, 
      @RequestParam(value="first-name") String firstname) { 
    // 변수명으로 사용할 수 없는 파라미터명인 경우 @RequestParam을 사용하여 명시적으로 지정하라!
    
   System.out.println(name);
   System.out.println(age);
   System.out.println(firstname);
   return "/hello.jsp";
  }
  
}










