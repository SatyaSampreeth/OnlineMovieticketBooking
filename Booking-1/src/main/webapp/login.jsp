<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title> 
<style>  
h1{
  font-family: Calibri; 
  font-size: 25pt;         
  font-style: normal; 
  font-weight: bold; 
  color:SlateBlue;
  text-align: center; 
  text-decoration: underline
}
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
</style>
</head>
<body>

<center>
		<h1>Login Form</h1>
	</center>

	${error}
	<form method="post" action="checkLogin">
		
		<table border="0" cellpadding="2" cellspacing="2">
			<tr>
				<td>UserName(E-mail)</td>
				<td><input type="text" placeholder="Enter username" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" placeholder="Enter Password" name="password"></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>

</body>
</html>
