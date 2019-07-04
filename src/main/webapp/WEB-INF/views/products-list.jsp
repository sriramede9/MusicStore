<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



	<!-- Marketing messaging and featurettes
    ================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->



	<div class="container-wrapper">

		<div class="container">

			<div class="page-header">
				<h1>All Products</h1>
				<p class="lead">Check out all the awesome products available
					now!</p>
			</div>

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
						<td><a href="<spring:url value="/list/viewproduct/${product.id }"/>">
						 <img src="https://img.icons8.com/ultraviolet/40/000000/about-us-female.png" width="20px" height="20px"></a>|<a href="<spring:url value="/admin/productinventory/delete/${product.id}"/>">
						 <img src="https://img.icons8.com/office/16/000000/delete-sign.png" width="20px" height="20px"></a></td>
						 
					</tr>
					</c:forEach>
				</thead>
			</table>
<%@include file="/WEB-INF/views/template/footer.jsp"  %>


	
