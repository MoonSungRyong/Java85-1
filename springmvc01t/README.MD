# Spring Web MVC 사용법

## 스프링 프런트 컨트롤러 설정하기
- 스프링에서 제공하는 프런트 컨트롤러 서블릿을 web.xml에 설정한다.
  => /webapp/WEB-INF/web.xml

## 페이지 컨트롤러 만드는 방법
- Test01.java : @Controller와 @RequestMapping 애노테이션  
- Test02.java : @RequestMapping 애노테이션과 URL
- Test03.java : @RequestMapping 과 요청 방식(GET/POST 등)
  /webapp/http-request.html을 사용하여 테스트하라!
- Test04.java : @RequestMapping 과 요청 파라미터
- Test05.java : @RequestMapping 과 요청 헤더

## 요청 핸들러에서 파라미터 값을 받는 방법 
- Test06.java : 파라미터 값 받기
- Test07.java : 자바 원시 타입의 값으로 파라미터 받기
- Test08.java : Value Object로 요청 파라미터의 값을 받기 
- Test09.java : 커스텀 에디터 사용
- Test10.java : 글로벌 커스텀 에디터 사용
  MyWebBindingInitializer.java : 2.5, 3.2 방식
  MyControllerAdvice.java : 4 방식   
- Test11.java : 요청 핸들러에서 기타 파라미터로 받을 수 있는 객체  

## 페이지 컨트롤러에서 클라이언트로 출력하는 방법
- Test12.java : 페이지 컨트롤러에서 JSP로 값 전달하기
- Test13.java : 요청 핸들러에서 직접 클라이언트로 출력하기

## 쿠키와 세션
- Test14.java : 쿠키 만들기와 사용하기 
- Test15.java : 세션 만들기와 사용하기 
- Test16.java : 다른 페이지 컨트롤러에서 지정한 세션을 사용할 수 있는지 여부 확인하기!

## 파일 업로드
- Test17.java : 파일 업로드
  /webapp/test17.html
  => 스프링 설정 파일에 멀티파트 요청 데이터를 처리할 객체를 등록한다.
  => 아파치 fileupload 라이브러리를 추가한다.
  
## 인터셉터
- 프론트 컨트롤러에서 페이지 컨트롤러를 실행하기 전에 후에 특정 작업을 끼워넣는 기술
- JSP(뷰 컨트롤러)를 실행한 후에 특정 작업을 끼워넣는 기술
=> 페이지 컨트롤러 생성 : Test18.java
=> 뷰 컨트롤러 생성 : test18aaa.jsp, test18bbb.jsp
=> 인터셉터 생성 : Test18Interceptor.java
=> 인터셉터를 스프링 설정 파일에 등록: dispatcher-servlet.xml
 
  
  
  
  
  
  
  
    
 