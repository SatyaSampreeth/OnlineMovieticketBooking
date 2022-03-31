<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addUser" method="post">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="fname"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="user_fname" required>
    
    <label for="lname"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="user_lname" required>
    
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="user_email" required>

    <label for="pass"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="user_pass" required>

    <label for="mobile"><b>Mobile</b></label>
    <input type="text" placeholder="Enter Mobile" name="user_mobile" required>
    
    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>
</body>
</html>