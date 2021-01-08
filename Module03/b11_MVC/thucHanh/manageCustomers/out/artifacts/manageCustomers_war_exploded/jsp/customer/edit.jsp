<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/7/2021
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Information Customer</title>
</head>
<body>
<h1>Edit Information Customer</h1>
<form action="customers" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td><input type="text" value="${customer.id}" readonly name="id"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" value="${customer.name}" name="name"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" value="${customer.email}" name="email"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" value="${customer.address}" name="address"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
        <input type="hidden" name="action" value="edit">
    </table>
    <a href="customers">Back to list customer</a>
</form>
</body>
</html>
