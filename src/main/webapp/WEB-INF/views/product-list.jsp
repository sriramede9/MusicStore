<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>product_List</title>

</head>
<body>

	<table style="width: 20%">
		<tr>
			<th>ProductName</th>
			<th>ProductCategory</th>
			<th>ProductCondition</th>
			<th>ProductPrice</th>
		</tr>
		<tr>
			<td>${product.productname}</td>
			<td>${product.productCategory}</td>
			<td>${product.productCondition}</td>
			<td>${product.productPrice}</td>
		</tr>

	</table>



</body>
</html>