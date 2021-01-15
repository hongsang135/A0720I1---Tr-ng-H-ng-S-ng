<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/12/2021
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infor User</title>
</head>
<body>
<h1>Information User</h1>
<table>
    <tr>
        <td>ID</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Country</td>
        <td>${user.country}</td>
    </tr>
</table>
<a href="users">Back to list Users</a>
</body>
</html>
