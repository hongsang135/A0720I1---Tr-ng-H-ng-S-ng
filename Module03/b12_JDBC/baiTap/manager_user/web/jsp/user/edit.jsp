<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/12/2021
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
<h1>Edit User</h1>
<form action="users" method="post">
    <table>
        <tr>
            <td>Id</td>
            <td><input type="text" name="id" readonly value="${user.id}"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${user.email}"></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><input type="text" name="country" value="${user.country}"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>
    <a href="users">Back to list Users!!!</a>
    <input type="hidden" name="action" value="edit">
</form>
</body>
</html>
