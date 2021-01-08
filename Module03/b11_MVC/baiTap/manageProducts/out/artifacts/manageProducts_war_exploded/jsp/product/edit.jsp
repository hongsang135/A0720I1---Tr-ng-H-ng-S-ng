<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit product!!</h1>
<form action="products" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td colspan="2"><input type="text" name="id" readonly value="${product.id}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td colspan="2"><input type="text" name="name" value="${product.name}"></td>
        </tr>
        <tr>
            <td>Inventory</td>
            <td colspan="2"><input type="text" name="inventory" value="${product.inventory}"></td>
        </tr>
        <tr>
            <td>Sold</td>
            <td colspan="2"><input type="text" name="sold" value="${product.sold}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <a href="products">Back to list!!!</a>
    <input type="hidden" name="action" value="edit">
</form>
</body>
</html>
