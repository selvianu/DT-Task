<%@page import="com.niit.bean.Medicine"%>
<%@page import="com.niit.bean.Candidate"%>
<%@page import="java.util.List"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>
	<!--  <h2>Hello World!</h2> -->

	<%
		List<Medicine> list = (List) request.getAttribute("MEDICINE_LIST");
		//out.println(list);
	%>

	<table border="1">
		<thead>
			<tr>
				<th>Category</th>
				<th>Medicine Name</th>
				<th>Manufacture Date</th>
				<th>Expire Date</th>
				<th>Batch No</th>
				<th>Cost</th>

			</tr>
		</thead>
		<tbody>
			<%
				if (list != null) {

					for (Medicine m : list) {
			%>

			<tr>
				<td><%=m.getId()%></td>
				<td><%=m.getCategory()%></td>
				<td><%=m.getMedname()%></td>
				<td><%=m.getMdate()%></td>
				<td><%=m.getExdate()%></td>
				<td><%=m.getBatchno()%></td>
				<td><%=m.getCost()%></td>

				<td><a href="Delete?id=<%=m.getId()%>"
					class="btn btn-danger btn-sm">Delete </td>
				<td><a href="edit?id=<%=m.getId()%>"
					class="btn btn-warning btn-sm">Edit </td>
			</tr>
			<%
				}
				} else {
					out.println("<tr><td>no records)</td></tr>");
				}
			%>


		</tbody>
	</table>


	<a href="new"> Add Medicine</a>

	<br>
</body>
</html>