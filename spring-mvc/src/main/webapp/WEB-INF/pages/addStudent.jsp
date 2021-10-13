<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<div>
    <form:form action="/addStudent" modelAttribute="command" method="post">
        <div>
            <label for="">Roll Number</label>
            <form:input path="rollNumber"/>
        </div>
        
        <div>
            <label for="">Student Name</label>
            <form:input path="studentName"/>

        </div>
        <div>
            <label for="">Date of Birth</label>
            <form:input type="date" path="dateOfBirth"/>
        </div>
        
        <div>
            <label for="">Mark Scored</label>
            <form:input path="markScored"/>
        </div>
        
        <div>
            <input type = "submit" value = "Add">
        </div>
    </form:form>
</div>
</body>
</html>