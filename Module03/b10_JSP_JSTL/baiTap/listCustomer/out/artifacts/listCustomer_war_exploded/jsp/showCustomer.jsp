<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/4/2021
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show customer</title>
</head>
<body>
<div class="wrap">
    <div class="title">
        <h1>Danh Sách Khách Hàng</h1>
    </div>
    <div class="main">
        User đăng nhập: ${username}
        <a href="register">Register</a>
        <table class="content-table">
            <thead>
            <tr>
                <th>Tên</th>
                <th>Ngày Sinh</th>
                <th>Địa Chỉ</th>
                <th>Ảnh</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${myCustomer}" var="Customer">
                <tr>
                    <td>${Customer.getTen()}</td>
                    <td>${Customer.getNgaySinh()}</td>
                    <td>${Customer.getDiaChi()}</td>
                    <td><img src="<c:url value="${Customer.image}"/>" style="width: 70px; height: 70px"/>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="logout">Logout</a>
    </div>
</div>
</body>
</html>
