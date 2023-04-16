<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	if(id.equals("admin") && pwd.equals("admin1234")){
		response.sendRedirect("success.jsp");
	}
	else{
		response.sendRedirect("failed.jsp");
	}
%>
</body>
</html>