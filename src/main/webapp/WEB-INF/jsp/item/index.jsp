<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head><title>Items</title></head>
<body>
    <h3>Items</h3>
    <table border="1">
        <tr>
            <th>Category</th>
            <th>Product Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.categoryName}</td>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td><a href="/cart/add.php?pid=${product.id}">Add to cart</a></td>
        </tr>
        </c:forEach>
    </table>

</body>
</html>