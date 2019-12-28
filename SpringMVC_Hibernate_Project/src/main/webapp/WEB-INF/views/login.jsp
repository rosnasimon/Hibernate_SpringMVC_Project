<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">

<title>Insert title here</title>
<style>
body
{
  background: linear-gradient(to bottom left, #ffff66 50%, #ff6699 99%);  
}
.head2{
  color: #7a7a52;
  font-weight:bold;
  letter-spacing: 1px;
  font-size: 250%;
  margin-left: 40%;
  margin-top: 10%;

}
table
{
  margin-left: 41%;
  font-size: 150%;

}
.u,.p
{
  width:100%;
  padding:4%;
  border-radius:8px;
}
.login
{
  font-size: 100%;
  border:1px solid;
  width:60%;
  padding:1%;
  border-radius:8px;
}
.login:hover
{
  background-color: #ff9999;

}
</style>
</head>
<body>
	<form action="loginProcess" method="post">
	    <p class="head2">Enter Credentials</p><br>
		<table>
			<tr><td>Username: </td><td><input type="text" class="u" name="username" required autofocus></td></tr><tr></tr><br>
			<tr><td>Password: </td><td><input type="password" class="p" name="password" required></td></tr><tr></tr>
			<tr><td></td><td><input type="submit" class="login" value="Login"></td></tr>
		</table>
	</form>
</body>
</html>
