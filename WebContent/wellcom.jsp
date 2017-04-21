<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>wellcom to here!</h4>

	<%
		Cookie[] cookies = request.getCookies();
		if(cookies.length < 1){
			String path = "login.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/" + path);
			requestDispatcher.forward(request, response);
		}
	%>

	hello:<%=request.getParameter("name")%>
</body>
</html>