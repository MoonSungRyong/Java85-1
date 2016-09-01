<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
템플릿데이터1
템플릿데이터2
<%!
private int plus(int a, int b) {
  return a + b;
}
%>
템플릿데이터3
<%= plus(20, 30) %>    
템플릿데이터4
템플릿데이터5

<%-- 선언문(declaration element)
=> <%! 클래스 안에 작성할 자바 코드 %>
=> JSP 엔진이 하는 일
<%! 자바코드 %>  ------->  
class Test04_jsp ... {

  자바코드

  ...
}

태그 안에 작성한 자바 코드는 클래스 블록 안에 그대로 복사된다.

[예1]
<%! private int a; %>
==============================================================================
class Test04_jsp ... {

  private int a;

  ...
}

[예2]
<%! protected int plus(int a, int b) {
  return a + b;
}
 %>
==============================================================================
class Test04_jsp ... {

  protected int plus(int a, int b) {
	  return a + b;
	}

  ...
}

[잘못 사용한 예1]
<%! if (...) {} %>
==============================================================================
class Test04_jsp ... {

  if (...) {}

  ...
}

[잘못 사용한 예2]
<%= "string" %>
==============================================================================
class Test04_jsp ... {

  "string"

  ...
}


--%>
