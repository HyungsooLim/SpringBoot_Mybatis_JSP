<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous"
>

<title>Spring Boot JSP - memberJoin</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false"
			aria-label="Toggle navigation"
		>
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="navbar-brand" href="#">Hidden brand</a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active">
					<a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="./member/join">JOIN</a>
				</li>
				<li class="nav-item">
					<a class="nav-link disabled" href="#" tabindex="-1"aria-disabled="true">Disabled</a>
				</li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	
	<!----------- main ------------>
	<h3>Member Join Page</h3>
	<div class="container">
		<form id="frm" action="./join" method="POST">
			<div class="form-group">
				<label for="username">ID</label> 
				<input type="text" class="form-control" id="username" aria-describedby="usernameHelp" name="username">
			</div>
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" class="form-control" id="password" name="password">
			</div>
			<div class="form-group">
				<label for="passwordCheck">Password Check</label> 
				<input type="password" class="form-control" id="passwordCheck">
			</div>
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" class="form-control etc" id="name" name="name">
			</div>
			
			<div class="form-group">
				<label for="email">Email</label> 
				<input type="email" class="form-control etc" id="email" name="email">
			</div>
			<div class="form-group">
				<label for="phone">Phone</label> 
				<input type="tel" class="form-control etc" id="phone" name="phone">
			</div>
			
			<input type="submit" id="btn" value="JOIN" class="btn btn-primary">
			
		</form>
	</div>
	
	<!----------- footer ------------>
	<footer class="footer mt-auto py-3 bg-dark">
  		<div class="container">
    		<span class="text-muted">Place sticky footer content here.</span>
  		</div>
	</footer>

<!-- ==============JS======================= -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"
	></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
		crossorigin="anonymous"
	></script>
	
</body>
</html>