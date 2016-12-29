<%@page import="com.niit.bean.Candidate"%>
<%@page import="java.util.List"%>
<html>
<body>
	<h2>Search by Aadhar Number</h2>
	<form action="SearchByAadhar" method="get">
		<input type="text" name="aadhar" required
			placeholder="enter the aadhar number"> <input type="submit"
			name="search">
	</form>
	<%
		List<Candidate> list = (List) request.getAttribute("CANDIDATE_LIST");
		//out.println(list);
	%>
	<h3>Search Results</h3>

	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email Id</th>
				<th>Address</th>
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
				<!-- 	<td><a href="Delete?id=<%=c.getId()%>">Delete </td>
				<td><a href="edit?id=<%=c.getId()%>">Edit </td>-->
			</tr>
			<%
				}
				} else {
					out.println("<tr><td>no records)</td></tr>");
				}
			%>


		</tbody>
	</table>

	<a href="new"> Add</a>
	<br>

</body>
</html>
