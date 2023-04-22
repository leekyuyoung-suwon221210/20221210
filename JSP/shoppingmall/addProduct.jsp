<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"></jsp:useBean>
</head>

<jsp:include page="./menu.jsp"></jsp:include>
<%-- <%@ include file="./menu.jsp" %> --%>
<div class="container">
	<h1 class="display-3">상품 등록</h1>
</div>

<body>
<div class="container">
	<form name='newProduct' action="processAddProduct.jsp" method="post">
		<div class = "form-group row">
			<label class="col-sm-2">상품코드</label>
			<div class='col-sm-3'>
				<input type="text" name="productId" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">상품명</label>
			<div class='col-sm-3'>
				<input type="text" name="productName" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">가격</label>
			<div class='col-sm-3'>
				<input type="text" name="unitPrice" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">상세 정보</label>
			<div class='col-sm-5'>
				<textarea name='description' rows="2" cols="50" class='form-control'></textarea>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">제조사</label>
			<div class='col-sm-3'>
				<input type="text" name="manufacturer" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">분류</label>
			<div class='col-sm-3'>
				<input type="text" name="category" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">제고수</label>
			<div class='col-sm-3'>
				<input type="text" name="unitInStock" class='form-control'>
			</div>
		</div>
		<div class = "form-group row">
			<label class="col-sm-2">상태</label>
			<div class='col-sm-5'>
				<input type="radio" name="condition" value="New" checked="checked">신규 제품
				<input type="radio" name="condition" value="Old">중고 제품
				<input type="radio" name="condition" value="Refurbished">재생 제품
			</div>
		</div>
		<div class = "form-group row">			
			<div class='"col-sm-offset-2 col-sm-10"'>
				<input type="submit" class = 'btn btn-primary' value="등록">
			</div>
		</div>
	</form>
</div>




</body>

<jsp:include page="./footer.jsp"></jsp:include>
<script>
	const $currentActive = document.querySelector('.nav-link.active');
	$currentActive.className = $currentActive.className.replace('active',"");
	const $productregister = document.querySelector('#productregister');
	$productregister.className += ' active';
</script>

</html>