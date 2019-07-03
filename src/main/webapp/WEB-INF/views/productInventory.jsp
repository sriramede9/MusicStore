<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

	<div class="container">

		<div class="page-header">
			<h1>Product Inventory Page</h1>
			<p class="lead">welcome to product Inventory page!</p>
		</div>
		<h3>
			<a href="<c:url value="/admin/productinventory"/>">Product
				Inventory</a>
		</h3>

		<p>An Admin can view,modify product inventory</p>



		<!-- Table  -->
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Photo Thumb</th>
					<th>Product Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
					<th></th>
				</tr>
				<!--table row for image -->

				<c:forEach items="${productlist}" var="product">


					<tr>
						<td><img src="#" alt="Image for Drums"></td>
						<td>${product.productname}</td>
						<td>${product.productCategory}</td>
						<td>${product.productCondition}</td>
						<td>${product.productPrice}Euro</td>
						<td><a
							href=" <spring:url value="/list/viewproduct/${product.id }"/>">
								<img
								src="https://img.icons8.com/ultraviolet/40/000000/about-us-female.png"
								width="20px" height="20px" />
						</a></td>
					</tr>
				</c:forEach>
			</thead>
		</table>

		<br> <a
			href="<spring:url value="/admin/productinventory/addproduct"/>"
			class="btn btn-primary">Add Product</a>
			 <br>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>