<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디렉티브 태그</title>
</head>
<body>
	<%
	new Date();
	%>
	<h3>디렉티브 태그</h3>
	<ul>jsp페이지를 어떻게 처리할 것인지를 설정하는 태그
	</ul>
	<ul>
		jsp페이지가 서블릿 프로그램에서 서블릿 클래스로 변환할때
		<br>jsp 페이지와 관련된 정보를 jsp 컨터이너에 지시하는 메세지
	</ul>
	<h3>page 디렉티브 태그 @page</h3>
	<ul>session 속성
	</ul>
	<h3>include 디렉티브 태그 @include</h3>
	<ul>페이지에 다른 페이지 내용을 추가할때
	</ul>
	<h3>taglib 디렉티브 태그 @taglib</h3>
	<br>
	<a href="./include_sample.jsp">다음 강의 : include 살펴보기</a>
	
</body>
</html>