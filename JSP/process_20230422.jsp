<%@page import="java.util.Enumeration"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>20230422 에서 데이터 읽기</title>
</head>
<body>
<%
	// String 변수 = request.getParameter(요청파라메터 이름)
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
%>
<p><%=id %>
<p><%=gender %>
<%
	for(String h : hobby){
		if(h!=null)
			out.print(h+"<br>");
	}
%>

<br><br><br>
<%
	Enumeration<String> en =  request.getParameterNames();
	while(en.hasMoreElements()){
		String name = en.nextElement();
		String value =  request.getParameter(name);
		out.print("name:"+name+" value:"+value+"<br>");
	}
%>
</body>
</html>