<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Library - NavBar</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.carousel-inner>img {
	width: 70%;
	margin: auto;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container">
		<br>
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Online Library</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
			<li><a href="#">Register</a></li>
			<li><a href="#">Sign In</a>
		</ul>
	</div>
	</nav>

	<div class="container">
		<h3>Library - Basic Navbar Example</h3>
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
				<li data-target="#myCarousel" data-slide-to="4"></li>
			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="l1.jpg" width="560" height="345">
				</div>
				<div class="item">
					<img src="l2.jpg" alt="" width="560" height="345">
				</div>
				<div class="item">
					<img src="l3.jpg" alt="" width="560" height="345">
				</div>
				<div class="item">
					<img src="l5.jpg" alt="" width="560" height="345">
				</div>
				<div class="item">
					<img src="l6.jpg" alt="" width="560" height="345">
				</div>


				<a class="left carousel-control" href="#myCarousel" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span></a>
			</div>
		</div>
	</div>
</body>
</html>