<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

<a href="Home.jsp">Home</a>&nbsp;&nbsp;
<a href="AboutUs.jsp">AboutUs</a>&nbsp;&nbsp;
<a href="logout">Log Out</a>

<%  String name=(String) session.getAttribute("value_key"); %>

<h1>Welcome To Ragnarok:<%= name %> </h1>
</body>
</html>