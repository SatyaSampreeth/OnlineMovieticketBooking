<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dummy Page</title>
</head>
<body>

	<h3>Success Page</h3>
	<%
		
		 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
		
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("/login");
		}
	
	%>
	Welcome, ${sessionScope.username }
	<br>
	
	<a href="${pageContext.request.contextPath }/logout">Logout</a>
</body>
</html>

