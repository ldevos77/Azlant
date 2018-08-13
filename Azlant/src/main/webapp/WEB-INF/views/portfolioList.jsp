<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title><spring:message code="view.portfolio.title" /></title>
	<c:url value="/resources/css/azlant.css" var="azlantCss" />
	<link rel="stylesheet" href="${azlantCss}">
</head>
<body>
<div class="global">
<header class="header">
	<h1>Azlant</h1>
</header>
<nav class="menu">
	<ul id="main-menu">
		<li><a href="index.html">Index</a></li>
	</ul>
</nav>
<section class="content">
	<h1>Portfolio list</h1>
	<table>
		<tr>
			<!-- id -->
			<td>Id</td>
			<!-- name -->
			<td>Name</td>
		</tr>
		<c:forEach items="${portfolios}" var="portfolio">
		<tr>
			<td>${portfolio.id}</td>
			<td>
				<c:url value="/portfolio/get/${portfolio.id}" var="portfolioUrl" />
				<a href="${portfolioUrl}">${portfolio.name}</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</section>
<footer class="footer">author:ldevos77@gmail.com</footer>
</div>
</body>
</html>