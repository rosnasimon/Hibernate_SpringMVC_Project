<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style>
body
{
  background: linear-gradient(to bottom right, #993366 50%, #00ffff 100%);
}
.head2{
  color: #fff;
  font-weight:bold;
  letter-spacing: 1px;
  font-size: 280%;
  margin-left: 5%;
  margin-top: 10%;

}
</style>
</head>
<body>
	<center>
	<p class="head2">Welcome <%=request.getParameter("username") %>..........</p>
	</center>
</body>
</html>
