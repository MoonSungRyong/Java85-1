/* 주제: Value Object로 요청 파라미터의 값을 받기
 * => 만약 요청 핸들러(요청이 들어왔을 때 호출되는 메서드)의 아규먼트 타입이 클래스인 경우,
 *    - 그 클래스의 객체를 생성한다.
 *    - 그 클래스의 프로퍼티 이름과 같은 요청 파라미터가 있다면 그 값을 저장한다.
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   
@RequestMapping("/test08")
public class Test08 {
  
  @RequestMapping("/m1")
  public String m1(Member member) { 
    System.out.println(member.getName());
    System.out.println(member);
    return "/hello.jsp";
  }
  
  
}










