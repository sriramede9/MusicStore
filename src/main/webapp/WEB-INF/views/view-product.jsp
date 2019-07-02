<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<!-- Marketing messaging and featurettes
    ================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

	<div class="container">

		<div class="page-header">
			<h1>Product Detail</h1>
			<p class="lead">Here are the detail information of the product</p>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img alt="" src="#" style="" />
				</div>
				<!-- information content -->
				<div class="col-md-5">
					<h1>${product.productname}</h1>
					<p>${product.productDescription }</p>
					<p>
						<strong> Manufacturer: </strong>${product.productManufacturer }</p>
					<p>
						<strong>Category: </strong>${product.productCategory}</p>
					<p>
						<strong>Condition: </strong>${product.productCondition}</p>
					<p>${product.productPrice}Euro</p>

				</div>

			</div>

		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>