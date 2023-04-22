<%@page import="dao.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="productDAO" class="dao.ProductRepository"
	scope="session"></jsp:useBean>
<%
String productId = request.getParameter("productId");
String pname = request.getParameter("productName");
Integer unitPrice = Integer.parseInt( request.getParameter("unitPrice") );
String description = request.getParameter("description");
String manufacturer = request.getParameter("manufacturer");
String category = request.getParameter("category");
Long unitInStock = Long.parseLong( request.getParameter("unitInStock") );
String condition = request.getParameter("condition");
Product p = new Product(productId, pname, unitPrice, description, manufacturer,
		category, unitInStock, condition);

productDAO.addProduct(p);

response.sendRedirect("products.jsp");

%>
</body>
</html>