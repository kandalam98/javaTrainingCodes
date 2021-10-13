<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table>
	<tr>
		<th>Sl.No</th>
		<th>Name</th>
		<th>Marks scored</th>
	</tr>
<c : forEach items="${foundStudent}" var="eachStudent" >
	<tr>
	        <td>${eachStduent.className }<td/>
	        <td>${eachStduent.name }<td/>
	        <td>${eachStduent.marks }<td/>
	        <c:if test="${eachStudent.marks<90 }">
	        <td style="color: #black">${eachStduent.marks }</td>
	        </c:if>
	<tr>

</c : forEach>


</table>
</body>
</html>