<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>액션 태그
		<li>서버나 클라이언트에게 어떤 행동을 하도록 명령하는 태그</li>
		<li>jsp 페이지에서 페이지와 페이지사이를 제어</li>
		<li>다른 페이지의 실행 결과 내용을 현재페이지에 포함</li>		
	</ul>		
	<ul>forward 액션 태그
		<li>현재 jsp에서 다른 jsp로 이동하는 태그</li>
		<li>브라우져에서 요청이오면 서버에서 페이지정보를 읽는데.. 거기에 forward가 있으면 </li>
		<li>해당 페이지를 다시 읽어서 클라이언트에 응답 즉 서버내부에서 페이지 이동 </li>
	</ul>
	<ul>include 액션 태그
		<li>결과를 가져와서 내장시킨다. 주로 동적페이지에 사용</li>
	</ul>
	<ul>param 액션 태그
		<li>현재 페이지에서 다른 페이지에 정보를 전달하는 태그</li>
		<li>전달할때는 forward 나 include 태그 내부에 사용</li>
	</ul>
	<ul>자바빈스 액션 태그
		<li>외부에서만든 자바파일을 객체화 해서 jsp에서 사용할때</li>
		<li>즉.. jsp컨테이너가 미리 자바빈스들을 등록하고.. 사용자는 따로 객체 생성없이 사용</li>
	</ul>
</body>
</html>