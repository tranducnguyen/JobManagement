<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="./css/form-job.css" rel="stylesheet">
<title>Quản lý Task</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<form:form action="" method="POST" modelAttribute="job"
		class="form-job">
		<h1>QUẢN LÝ TASK</h1>
		<div class="input-box">
			<label> <strong>Job Name</strong>
			</label>
			<form:input path="job_nm" type="text" placeholder="Nhập JOB name" />
		</div>
		<div class="input-box">
			<label> <strong>Job Description</strong>
			</label>
			<form:input path="job_ds" type="text" placeholder="Job description" />
		</div>
		<div class="input-box">
			<label> <strong>Job Details</strong>
			</label>
			<form:input path="job_dt" type="text" placeholder="Job details" />
		</div>
		<div class="btn-box">
			<button type="submit" formaction="/createjob">Tạo job mới</button>
		</div>
	</form:form>
</body>
</html>