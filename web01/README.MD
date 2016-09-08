# 서블릿 프로그래밍 (/src02)
## 서블릿 생명주기
- Servlet01.java : 서블릿의 생성, 실행, 소멸 과정과 호출되는 메서드의 관계
- Servlet02.java : 생성자 vs init() 메서드
- Servlet03.java : <load-on-startup> 태그
- Servlet04.java : 애노테이션으로 서블릿 등록하기
- Servlet05.java : 웹브라우저에게 콘텐츠를 출력하기
- Servlet06.java 와 AbstractServlet: Servlet 인터페이스에서 service() 만 구현하고 싶다.
- Servlet07.java : GenericServlet 클래스를 상속 받아 서블릿 구현하기 
- Servlet08.java : HttpServlet 클래스를 상속 받아 서블릿 구현하기 
- Servlet09.java : 한글 출력 시 '?' 문자가 출력되는 문제 고치기
- Servlet10.java : HTML 출력하기     
- Servlet11.java : 서블릿에 데이터 전달하기, 클라이언트가 보낸 데이터 꺼내기   
- Servlet12.java : 계산기 웹 애플리케이션 만들기
- Servlet13.java : HTTP 요청과 응답 
- Servlet14.java : 요청 방식과 응답 - GET, POST, HEAD
- Servlet15.java : POST 요청으로 데이터를 보낼 때 한글 깨짐 문제


## 필터
- Filter01.java : 필터 만드는 방법과 구동원리   
  Servlet16.java
- Filter02.java : 여러 개의 필터 적용하기
- Filter03.java : 필터의 용도
  Servlet17.java
  
  
## 리스너
- Listener01.java : 리스너 개요 및 ServletContextListener 사용법
- Listener02.java : ServletRequestListener 사용법 및 @WebListener 애노테이션을 이용한 리스너 등록
  Servlet18.java
   
## HTTP 프로토콜과 서블릿 - servlet2
- Servlet19.java : HttpServletRequest와 HttpServletResponse
- Servlet20.java : GET 요청과 POST 요청 구분하기
  servlet20.html
- Servlet21.java : HttpGenericServlet 도우미 클래스 사용하기
  HttpGenericServlet.java
  servlet21.html
- Servlet22.java : HttpGenericServlet2 도우미 클래스 사용하기
  HttpGenericServlet2.java
  servlet22.html
- Servlet23.java : 오리지날 도우미 클래스(HttpServlet) 사용하기    
  servlet23.html
- Servlet24_*.java : 리프래시(Refresh)하는 방법과 용도 
  Servlet25_*.java
- Servlet26.java : 리다이렉트(Redirect)하는 방법과 용도
- Servlet27_*.java : 포워딩(forwarding)
- Servlet28_*.java : 인클루딩(including)
- Servlet29_*.java : 포워딩과 인클루딩 활용

## 보관소 - servlet3
- Servlet30.java : ServletContext 보관소와 ServletRequest 보관소
  Servlet31.java
  Servlet32.java 
- Servlet33_*.java : ServletContext 보관소 사용 시 주의할 점
- Servlet34_*.java : HttpSession 보관소를 이용하여 클라이언트 별 데이터 관리

## 쿠키 - servlet4
- Servlet35.java : 클라이언트에게 데이터를 보관시키는 방법 - "쿠키(cookie)"
- Servlet36.java : 쿠키 값 꺼내기
- Servlet37.java : 쿠키를 사용할 수 있는 범위(URL)을 지정하기 
- Servlet38.java : 쿠키 값 꺼내기 - /web01/
- Servlet39.java : 쿠키 값 꺼내기 - /web01/test
- Servlet40.java : 쿠키 값 꺼내기 - /web01/test/okok/haha
- Servlet41.java : 쿠키 값 꺼내기 - /web01/test2
- Servlet42.java : 쿠키의 유효기간 지정하기
- Servlet43.java : 유효기간에 따른 쿠키 정보 추출 가능 여부

## 세션 - servlet5
- Servlet44.java : 세션 생성하기
- Servlet45.java : 기존 세션 사용하기
- Servlet46.java : 세션에 데이터 저장하기 
- Servlet47.java : 세션에 저장된 데이터 사용하기
- Servlet48.java : 세션 무효화시키기

# JSP 프로그래밍
- /webapp/jsp1/Test01.jsp : 
- /webapp/jsp2/Test05.jsp : JSP 액션 태그 - <jsp:useBean>



   
   
   
   
   
   