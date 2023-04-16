<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈 사용</title>
</head>
<body>
	<jsp:useBean id="ca" class="dao.Calculator"></jsp:useBean>
	<h1>5의 3제곱? </h1>
	<%=ca.myMethod(5) %>
</body>
</html>