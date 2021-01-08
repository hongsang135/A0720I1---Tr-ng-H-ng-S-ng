<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 12:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information Customer</title>
</head>
<body>
    <h1>Information Customer</h1>
    <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${customer.name}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="name" value="${customer.email}"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="name" value="${customer.address}"></td>
        </tr>
    </table>
    <a href="customers">Back to list customer</a>
</body>
</html>
