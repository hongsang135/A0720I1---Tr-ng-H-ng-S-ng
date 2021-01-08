<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/8/2021
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product by name</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="js/product/search.js" type="text/javascript"></script>
</head>
<body>
<h1>Search product by name!!!</h1>
<form action="products" method="post">
    <input type="text" placeholder="input name" id="name">
    <input type="button" value="Search" id="search">
</form>
<hr>
<div id="result"></div>
</body>
</html>
