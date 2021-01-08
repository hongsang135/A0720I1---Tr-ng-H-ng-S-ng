<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 6:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new product</title>
</head>
<body>
<h1>Add new product!</h1>
<form action="products" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td colspan="2"><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td colspan="2"><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Inventory</td>
            <td colspan="2"><input type="text" name="inventory"></td>
        </tr>
        <tr>
            <td>Sold</td>
            <td colspan="2"><input type="text" name="sold"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <a href="products">Back to list product!</a>
    <input type="hidden" name="action" value="add">
</form>
</body>
</html>
