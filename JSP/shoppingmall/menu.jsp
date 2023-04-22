<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="./welcome.jsp">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a id="productlist" class="nav-link active" aria-current="page" href="./products.jsp">상품목록</a>
        <a id='productregister' class="nav-link" href="./addProduct.jsp">상품등록</a>
        <a class="nav-link" href="#">other3</a>
        <a class="nav-link disabled">other4</a>
      </div>
    </div>
  </div>
</nav>