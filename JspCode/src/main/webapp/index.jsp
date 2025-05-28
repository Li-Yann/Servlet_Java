
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Example</title>
</head>
<body>
<%!
//Declaring variable and functions
	int a=5;
	String name="Abhiyan Limbu";
	int sq(){
		return a*a*a;
	}
%>

<%
//Just Use java Code
	int b=100;
	if(b<1000){
		out.println("B is less than 1000");
	}
	else{
		out.println("B is greater than 1000");
	}
	
	for(int i=0;i<=9;i++){
		out.println("<br>Kist College");
	}

%>

<!--Printing above value-->
<%out.println("<br>Value: "); %>
<%= a %>
<%out.println("<br>Name: "); %>
<%= name %>
<%out.println("<br>Square of function: "); %>
<%= sq() %>

</body>
</html>