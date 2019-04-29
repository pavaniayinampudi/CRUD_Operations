<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Here you can see the list of the teams, edit them, remove or update.</p>
	<c:if test="${!empty teams}">
	
	<h1> hey its working</h1>
	
<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="10%">rating</th><th width="10%">actions</th>
</tr>
</thead>
<c:forEach items="${teams}" var="team">

<tbody>
<tr>
<td>${team.id}</td>
    <td>${team.name}</td>
    <td>${team.rating}</td>
     <td>
    <a href="${pageContext.request.contextPath}/edit/${team.id}">Edit</a><br>
    <a href="${pageContext.request.contextPath}/delete/${team.id}">Delete</a><br>
    </td>
    </tr>
</c:forEach>
    
   
   
</tr>

 
</tbody>
</table> 
	</c:if>
<%-- --%>

	<p>
		<a href="${pageContext.request.contextPath}/">Home page</a>
	</p>
</body>
</html>