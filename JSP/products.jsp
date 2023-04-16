<%@page import="dao.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"></jsp:useBean>

<%
	List<Product> listofProducts = productDAO.getAllProducts();			
%>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="container">
		<h1 class="display-3">상품 목록</h1>
	</div>
	
	<div class="container">
		<div class="row" align = 'center'>
			<%
			for(int i=0; i < listofProducts.size(); i++){
				Product p =  listofProducts.get(i);			
			%>
			<div class="col-md-4">
				<h3><%=p.getPname() %></h3>
				<p><%=p.getDescription() %></p>
				<p><%=p.getUnitPrice() %></p>
			</div>			
			<%
			}
			%>
		</div>
	</div>	
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>