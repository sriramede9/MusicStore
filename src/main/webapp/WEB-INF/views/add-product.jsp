<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

	<div class="container">

		<div class="page-header">
			<h1>Administrator's Add Product</h1>
			<p class="lead">Add Product</p>
		</div>


		<p>Fill all the details to Add the product</p>


		<form:form
			action="${pageContext.request.contextPath}/admin/productinventory/formresponse"
			method="POST" 
			modelAttribute="productobj" enctype="multipart/form-data">

			<form:hidden path="id" />

			<div class="form-group">
				<label for="product-name">Product Name</label>
				<form:input class="form-control" path="productname"
					placeholder="Enter Product name" />
			</div>

			<div class="form-group">
				<label for="product-category">Product Category</label>
				<form:input class="form-control" path="productCategory"
					placeholder="Enter Product Category" />
			</div>


			<div class="form-group">
				<label for="product-Description">Product Description</label>
				<form:input class="form-control" path="productDescription"
					placeholder="Enter Product Description" />
			</div>


			<div class="form-group">
				<label for="product-Price">Product Price</label>
				<form:input class="form-control" path="productPrice"
					placeholder="Enter Product Price" />
			</div>

			<div class="form-group">
				<label for="product-Condition">Product Condition</label>
				<form:input class="form-control" path="productCondition"
					placeholder="Enter Product Condition" />
			</div>

			<div class="form-group">
				<label for="product-Status">Product Status</label>
				<form:input class="form-control" path="productStatus"
					placeholder="Enter Product Status" />
			</div>

			<div class="form-group">
				<label for="instock">Units in Stock</label>
				<form:input class="form-control" path="unitsInStock"
					placeholder="Enter units in stock" />
			</div>

			<div class="form-group">
				<label for="manufacturer">Product Manufacturer</label>
				<form:input class="form-control" path="productManufacturer"
					placeholder="Enter ProductManufacturer" />
			</div>

			<div class="form-group">
			<label for="img">Image
				<input type="file" name="file" />
				</label>
			</div>


			<input type="submit" class="btn btn-primary" />




		</form:form>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>