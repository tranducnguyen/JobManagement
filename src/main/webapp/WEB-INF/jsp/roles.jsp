<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<form:form action="" method="POST" modelAttribute="role">
		<h1>ROLE</h1>
		<div class="input-box">
			<i></i>
			<form:input path="role_ID" type="text" placeholder="Role ID" />
		</div>
		<div class="input-box">
			<i></i>
			<form:input path="role_NM" type="text" placeholder="Role name" />
		</div>

		<div class="btn-box">
			<button type="submit" formaction="/createRole">Tạo mới</button>
		</div>
	</form:form>
</body>
</html>