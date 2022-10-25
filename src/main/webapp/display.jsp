<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.example.demo.*" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="login.jpg">
<h1><i>UserList</i></h1>
<%List<AdminLogin> e=(List<AdminLogin>)request.getAttribute("list");%>
<table border="1">
<tr>
<th>UserId</th>
<th>Username</th>
<th>Password</th>
<th>Email</th>
</tr>
click here to get<a href="create.jsp">product</a>details
<%for(AdminLogin ee: e){ %>
<tr>
<td><%=ee.getUserid()%></td>
<td><%=ee.getUsername()%></td>
<td><%=ee.getPassword()%></td>
<td><%=ee.getEmail()%></td>
</tr>
<%}%>
</table>
</body>
</html>