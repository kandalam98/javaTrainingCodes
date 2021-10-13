<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All</title>
</head>
<body>

<table>
	<tr>
		<th>Roll Number</th>
		<th>Student Name</th>
		<th> Date of Birth</th>
		<th>Mark scored </th>

	</tr>
	
<c:forEach  items="${data }"  var="eachItem">
     <tr>
          <th>${eachItem.rollNumber }</th>
          <th>${eachItem.studentName }</th>
          <th>${eachItem.dateOfBirth }</th>
          <th>${eachItem.markScored }</th>
     </tr>
</c:forEach>
</table>

</body>
</html>