<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About US</title>
</head>
<body>
<a href="Home.jsp">Home</a>&nbsp;&nbsp;
<a href="Profile.jsp">Profile</a>

<%  String name=(String) session.getAttribute("value_key"); %>

<h1>Welcome To Ragnarok:<%= name %> </h1>
</body>
</html>