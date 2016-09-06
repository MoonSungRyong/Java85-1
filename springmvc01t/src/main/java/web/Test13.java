/* 주제: 요청 핸들러에서 직접 클라이언트로 출력하기    
 */
package web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller   
@RequestMapping("/test13")
public class Test13 {
  
  // 요청 핸들러에 @ResponseBody 붙이면, 
  // 리턴 값은 뷰 컴포넌트(JSP)의 URL이 아니라, 
  // 클라이언트에게 보내는 데이터라는 뜻이다.
  // => 문제점: 한글이 출력될 때 ?로 바뀌어 보내진다.
  @RequestMapping("/m1")
  @ResponseBody
  public String m1() { 
    return "<html><head><meta charset='UTF-8'></head><body>hello! 안녕!</body></html>";
  }
  
  // 한글이 ?로 변환되는 것 해결책?
  // => 컨텐츠 타입을 지정하라!
  @RequestMapping(value="/m2", produces="text/html;charset=UTF-8")
  @ResponseBody
  public String m2() { 
    return "<html><head><meta charset='UTF-8'></head><body>hello! 안녕!</body></html>";
  }
 
  // 클라이언트로 직접 데이터를 보내는 또 다른 방법
  // => 다음 방법은 복잡하지만, 좀 더 정교하게 응답을 제어할 수 있다.
  //    예를 들면, 헤더 정보와 응답 상태 코드를 설정할 수 있다.
  // => DispatcherServlet(프런트 컨트롤러)은 이 메서드의 리턴 값을 분석하여 응답을 처리한다.
  @RequestMapping("/m3")
  public ResponseEntity<String> m3() {
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "text/html;charset=UTF-8");
    
    ResponseEntity<String> entity = new ResponseEntity<>(
        "<html><head><meta charset='UTF-8'></head><body>hello! 안녕!</body></html>",
        headers,
        HttpStatus.OK);
    
    return entity;
  }  
}










