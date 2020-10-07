<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/create" method="POST" modelAttribute="user">
		<h1>Đăng nhập vào website</h1>
		<div class="input-box">
			<i></i> <form:input path="user_Name" type="text" placeholder="Nhập username"/>
		</div>
		<div class="input-box">
			<i></i> <form:input path="user_Password" type="password" placeholder="Nhập mật khẩu"/>
		</div>
		<div class="btn-box">
			<button type="submit">Đăng nhập</button>
		</div>
	</form:form>
</body>
</html>