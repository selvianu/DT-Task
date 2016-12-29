<%@page import="com.niit.bean.Candidate"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
	<%
		Candidate candidate = (Candidate) request.getAttribute("CANDIDATE");
	%>
	<form action="Update" method="get">
		id:<input type="text" name="id" value="<%=candidate.getId()%>"
			readonly required> <br /> Name:<input type="text"
			name="name" value="<%=candidate.getName()%>"><br> <br>
		Email Id:<input type="text" name="email_id"
			value="<%=candidate.getEmailId()%>" required><br> <br>
		Address:<input type="text" name="address"
			value="<%=candidate.getAddress()%>" required> <br> <br>
		<input type="submit" name="Update">

	</form>
</body>
</html>