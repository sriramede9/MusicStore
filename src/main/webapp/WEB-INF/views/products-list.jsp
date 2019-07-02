<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp"  %>


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
					</tr>
					<!--table row for image -->
					
					<c:forEach items="${productlist}" var="product">
    

					<tr>
						<td><img src="#" alt="Image for Drums"></td>
						<td>${product.productname}</td>
						<td>${product.productCategory}</td>
						<td>${product.productCondition}</td>
						<td>${product.productPrice}Euro</td>
					</tr>
					</c:forEach>
				</thead>
			</table>
<%@include file="/WEB-INF/views/template/footer.jsp"  %>


	
