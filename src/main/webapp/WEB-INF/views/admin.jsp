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
			<h1>Administrator's Page</h1>
			<p class="lead">welcome to admins page!</p>
		</div>
		<h3>
			<a href="<c:url value="/admin/productinventory"/>">Product
				Inventory</a>
		</h3>

		<p>An Admin can view,modify product inventory</p>


		<%@include file="/WEB-INF/views/template/footer.jsp"%>