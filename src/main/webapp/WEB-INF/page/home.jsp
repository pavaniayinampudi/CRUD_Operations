<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
      
<html>

<body>
<h1>Home page</h1>

<h2>${message}</h2>
<c:url var="addAction" value="/add" ></c:url>

<a href ="${addAction}">add</a><br>
<br>
<br>

<a href="${pageContext.request.contextPath}/list">Team list</a><br>
</body>
</html>