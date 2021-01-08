<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/4/2021
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <td>Tên:</td>
            <td><input type="text" name="ten"></td>
        </tr>
        <tr>
            <td>Ngày sinh:</td>
            <td><input type="text" name="ngaysinh"></td>
        </tr>
        <tr>
            <td>Địa chỉ:</td>
            <td><input type="text" name="diachi"></td>
        </tr>
        <tr>
            <td>Ảnh:</td>
            <td><input type="file" name="image"></td>
        </tr>
    </table>
    <input type="submit" value="Register">
</form>
</body>
</html>
