<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	<form action="process_file001.jsp" method="post" enctype="multipart/form-data">
    <input type="file" name="filename">
    <input type="text" name="title">
    <input type="submit" value="제출">
</form>
</body>
</html>