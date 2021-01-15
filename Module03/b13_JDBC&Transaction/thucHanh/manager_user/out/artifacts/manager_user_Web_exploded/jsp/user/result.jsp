<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/13/2021
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <table>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Country</td>
            <td>View</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.country}</td>
                <td><a href="users?action=view&id=${user.id}">view</a></td>
                <td><a href="users?action=edit&id=${user.id}">edit</a></td>
                <td><a href="users?action=delete&id=${user.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
