<%@page import="com.niit.bean.Candidate"%>
<%@page import="java.util.List"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>
	<!--  <h2>Hello World!</h2> -->

	<%
		List<Candidate> list = (List) request.getAttribute("CANDIDATE_LIST");
		//out.println(list);
	%>

	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>EmailId</th>
				<th>Address</th>
				<th>Action</th>

			</tr>
		</thead>
		<tbody>
			<%
				if (list != null) {

					for (Candidate c : list) {
			%>

			<tr>
				<td><%=c.getId()%></td>
				<td><%=c.getName()%></td>
				<td><%=c.getEmailId()%></td>
				<td><%=c.getAddress()%></td>
				<td><a href="Delete?id=<%=c.getId()%>"
					class="btn btn-danger btn-sm">Delete </td>
				<td><a href="edit?id=<%=c.getId()%>" class="btn btn-warning btn-sm">Edit
				</td>
			</tr>
			<%
				}
				} else {
					out.println("<tr><td>no records)</td></tr>");
				}
			%>


		</tbody>
	</table>

	<a href="medicines/new"> Add Medicines</a>
	<a href="medicines/">List Medicines</a>
	<a href="new"> Add Customer</a>
	<a href="orders/add"> Order </a>

	<br>
</body>
</html>
