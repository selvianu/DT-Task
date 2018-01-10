
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Nav Bar - Demo</title>
</head>
<body>
	<nav id="navbar-red" class="navbar navbar-inverse" role="navigation">

	<div class="container">
		<div class="navbar-header">
			<ul class="nav navbar-nav">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#mainNavBar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</ul>
		</div>
		<div class="collapse navbar-collapse" id="mainNavBar">
			<ul class="nav navbar-nav">
				<li><a href="#">Home</a></li>
				<li><a href="#">Contact Us</a></li>
				<li><a href="#">Register</a></li>
				<li><a href="#">Sign In</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> Category<span class="carousel"></span></a></li>

			</ul>
		</div>
	</div>
	<h1>Kids Toys</h1>
	<h2>Pagination - Disabled State</h2>
	<p>Added 4 as disabled - disabled:</p>
	<ul class="pagination">
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li class="disabled"><a href="#">4</a></li>
		<li><a href="#">5</a></li>
	</ul>
</body>
</html>