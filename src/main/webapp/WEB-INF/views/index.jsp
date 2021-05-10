<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot JSP</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/index.css">
</head>
<body>
	<h1 class="c1">JSP Index Page</h1>
	<h1>${message }</h1>
	<img alt="" src="${pageContext.request.contextPath }/images/PremierLeague.png">
	<img alt="" src="${pageContext.request.contextPath }/images/Laliga.jpg">
</body>
</html>