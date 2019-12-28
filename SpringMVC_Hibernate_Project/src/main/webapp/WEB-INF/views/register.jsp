<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
  background: linear-gradient(to bottom right, #33ccff 50%, #ff99cc 100%);
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
input[type=text]
{
  width:100%;
  padding:4%;
  border-radius:8px;
}
.e,.p,.s
{
  width:100%;
  padding:4%;
  border-radius:8px;
}
.submit
{
  font-size: 150%;
  border:1px solid;
  margin-left: 47%;
  width:11%;
  border-radius:8px;
}
.submit:hover
{
  background-color: #ff9999;

}
</style>
</head>
<body>

	<form action="registerProcess">
    <p class="head2">Create an Account</p><br>

		<table>
			<tr><td>Full Name</td><td><input type="text" name="fullname" id="fullname" autofocus></td></tr>
			<tr><td>Email</td><td><input type="email" class="e" name="email" id="email"></td></tr>
			<tr><td>Phone Number</td><td><input type="text" name="phone" id="phone"></td></tr>
			<tr><td>Username</td><td><input type="text" name="username" id="username"></td></tr>
			<tr><td>Password</td><td><input type="password" class="p" name="password" id="password"></td></tr>
			<tr><td></td><td></td></tr>
		</table><br>
    <input type="submit" class="submit" value="Register">
	</form>
</body>
</html>
