<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fourth</title>
</head>
<body>
<%@ include file="menu.html" %>
<%= session.isNew() %>
<%= session.getId() %>
<h4>List of  Names </h4>
<c:out value="${name } ${location }"/>
</body>
</html>