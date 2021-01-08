<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<table border="1" style="border-collapse: collapse">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Inventory</td>
        <td>Sold</td>
        <td>View</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.inventory}</td>
            <td>${product.sold}</td>
            <td><a href="products?action=view&id=${product.id}">View</a></td>
            <td><a href="products?action=edit&id=${product.id}">Edit</a></td>
            <td><a href="products?action=delete&id=${product.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
