<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>아이디 : <%=request.getParameter("id") %></p>
	<p>이름 :  <%= URLDecoder.decode( request.getParameter("name") )%></p>
</body>
</html>