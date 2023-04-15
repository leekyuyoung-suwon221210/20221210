<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이 파일은 first.jsp 입니다.</h3>
	<jsp:include page="second.jsp">
		<jsp:param value="hong gil dong" name="myname"/>
	</jsp:include>
	
	<p>java Server Page</p>
</body>
</html>