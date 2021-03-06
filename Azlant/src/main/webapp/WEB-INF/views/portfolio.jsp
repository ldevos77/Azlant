<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title><spring:message code="view.portfolio.title" /></title>
	<spring:url value="/resources/css/azlant.css" var="azlantCss" />
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
	<h1>Portfolio</h1>
	<h2>Name : ${portfolio.name}</h2>
	<table>
		<tr>
			<!-- id -->
			<td>Id</td>
			<!-- Name -->
			<td>Name</td>
			<!-- Asset Class -->
			<td>Asset Class</td>
			<!-- ISIN Code -->
			<td>ISIN Code</td>
			<!-- quantity -->
			<td>Quantity</td>
			<!-- Purchase Price -->
			<td>Purchase Price</td>
			<!-- Trading Fees -->
			<td>Trading Fees</td>
		</tr>
		<c:forEach items="${portfolio.portfolioLines}" var="portfolioLine">
		<tr>
			<td>${portfolioLine.id}</td>
			<td>${portfolioLine.asset.name}</td>
			<td>${portfolioLine.asset.assetClass.name}</td>
			<td>${portfolioLine.asset.isinCode}</td>
			<td>${portfolioLine.quantity}</td>
			<td>${portfolioLine.purchasePrice}</td>
			<td>${portfolioLine.tradingFees}</td>
		</tr>
		</c:forEach>
	</table>
</section>
<footer class="footer">author:ldevos77@gmail.com</footer>
</div>
</body>
</html>