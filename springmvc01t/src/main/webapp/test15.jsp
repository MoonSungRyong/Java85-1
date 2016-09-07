<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ServletRequest</h2>
name: <%=request.getAttribute("name")%><br>
email: <%=request.getAttribute("email")%><br>
tel: <%=request.getAttribute("tel")%><br>

<h2>HttpSession</h2>
name: <%=session.getAttribute("name")%><br>
email: <%=session.getAttribute("email")%><br>
tel: <%=session.getAttribute("tel")%><br>
</body>
</html>








