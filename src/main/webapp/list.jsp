<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="com.example.demo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="shoes.jpg">
<%List<Product> p = (List<Product>)request.getAttribute("list");%>
<table border="1">
<tr>
<th>ProductId</th>
<th>ProductName</th>
<th>Colour</th>
<th>Price</th>
<th>BuyProduct</th>
</tr>
<%for(Product pp:p){%>
<tr>
<td><%=pp.getProductid()%></td>
<td><%=pp.getProductname()%></td>
<td><%=pp.getColour()%></td>
<td><%=pp.getPrice()%></td>
<td><a href="buy.jsp">Buy</a></td>
</tr>
<%}%>
</table>
</body>
</html>