<%@page import="java.io.File"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.commons.fileupload.DiskFileUpload"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItem"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.List"%>
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
	String fileUploadPath = "c://upload";
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request);	
	Iterator params =  items.iterator();
	while(params.hasNext()){
		FileItem item =  (FileItem)params.next();
		if(item.isFormField()){
			String title = item.getString("UTF-8");
			out.print("<h3>"+title+"</h3>");
		}else{
			String fileName = item.getName();
			out.print("<br>"+fileName);
		}
	}
			


%>
</body>
</html>