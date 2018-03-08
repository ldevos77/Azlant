<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <spring:url value="/resources/css/azlant.css" var="azlantCss" />
  <link rel="stylesheet" href="${azlantCss}">
  <title><spring:message code="view.portfolio.title" /></title>
</head>
<body>
  <h1>Portfolios management</h1>
  <h2>Portfolios : ${portfolio.name}</h2>
  <table>
    <tr>
      <!-- id -->
      <td>Id</td>
      <!-- name -->
  	  <td>Isin Code</td>
  	</tr>
  	<c:forEach items="${assets}" var="asset">
    <tr>
      <td>${asset.id}</td>
  	  <td>${asset.isinCode}</td>
  	</tr>
  	</c:forEach>
  </table>
</body>
</html>