<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>  Welcome to Online Pharmacy </h3>

<%


%>
<form action="save">

Candidate Id : <input type="text" name="customer_id" required autofocus /> <br/>

Medicine Name: <input type="text" name="medicine_name" required /><br/>

Qty: <input type="number" name="qty" required /> <br/>

Order Date: <input type="date" name="order_date" required />

<button type="submit">Submit Order</button>
</form>
</body>
</html>