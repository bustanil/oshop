<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head><title>Shopping Cart</title></head>
<body>
<h3>Shopping Cart</h3>

<form action="/cart/update.php" method="POST">
    <table border="1">
        <tr>
            <th>Item name</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Sub Total</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach var="item" items="${shoppingCart.items}">
            <tr>
                <td>${item.name}</td>
                <td><input name="item-${item.productId}" type="text" value="${item.quantity}" maxlength="2" size="2"/></td>
                <td>${item.price}</td>
                <td>${item.subTotal}</td>
                <td><a href="/cart/delete.php?pid=${item.productId}">X</a></td>
            </tr>
        </c:forEach>
        <tr align="right">
            <td colspan="2"><input type="submit" value="Update"/></td>
            <td colspan="3">Total: ${shoppingCart.total}</td>
        </tr>
    </table>
</form>

</body>
</html>