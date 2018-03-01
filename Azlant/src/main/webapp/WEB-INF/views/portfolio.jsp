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
  <h2>Portfolios :</h2>
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
  	  <td>${portfolio.name}</td>
  	</tr>
  	</c:forEach>
  </table>
  
  <h2><spring:message code="view.portfolio.title" /></h2>
  <table>
    <tr>
      <!-- Asset -->
      <td><spring:message code="view.portfolio.table.column1" /></td>
      <!-- Asset Class -->
  	  <td><spring:message code="view.portfolio.table.column2" /></td>
  	  <!-- Value -->
  	  <td><spring:message code="view.portfolio.table.column3" /></td>
  	</tr>
    <tr>
      <td>Axa</td>
  	  <td>Action</td>
  	  <td>0,00</td>
  	</tr>
    <tr>
      <td>Total</td>
  	  <td>Action</td>
  	  <td>0,00</td>
  	</tr>
    <tr>
      <td>Vinci</td>
  	  <td>Action</td>
  	  <td>0,00</td>
  	</tr>
  </table>
</body>
</html>