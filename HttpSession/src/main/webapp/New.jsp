
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String) session.getAttribute("key");
out.println("Welcome:"+name);

%>
</body>
</html>