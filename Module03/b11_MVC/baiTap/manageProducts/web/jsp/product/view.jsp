<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information Product</title>
</head>
<body>
    <h1>Information Product!</h1>
    <table>
        <tr>
            <td>ID</td>
            <td>${product.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${product.name}</td>
        </tr>
        <tr>
            <td>Inventory</td>
            <td>${product.inventory}</td>
        </tr>
        <tr>
            <td>Sold</td>
            <td>${product.sold}</td>
        </tr>
    </table>
    <a href="products">Back to list product!!</a>
</body>
</html>
