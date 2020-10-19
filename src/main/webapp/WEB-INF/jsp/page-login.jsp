<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>MotaAdmin - Bootstrap Admin Dashboard</title>
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="/images/favicon.png">
<link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body class="h-100">
	<div class="authincation h-100">
		<div class="container h-100">
			<div class="row justify-content-center h-100 align-items-center">
				<div class="col-md-6">
					<div class="authincation-content">
						<div class="row no-gutters">
							<div class="col-xl-12">
								<div class="auth-form">
									<h4 class="text-center mb-4">Sign in your account</h4>
									  <div><p>${note}</p>
									</div>
									<form:form action="" method="POST" modelAttribute="user">
										<div class="form-group">
											<label class="mb-1"><strong>User Name</strong></label>
											<form:input type="text" path="user_Name"
												class="form-control" />
										</div>
										<div class="form-group">
											<label class="mb-1"><strong>Password</strong></label>
											<form:input type="password" path="user_Password"
												class="form-control" />
										</div>
										<div class="form-row d-flex justify-content-between mt-4 mb-2">
											<div class="form-group">
												<div class="custom-control custom-checkbox ml-1">
													<input type="checkbox" class="custom-control-input"
														id="basic_checkbox_1"> <label
														class="custom-control-label" for="basic_checkbox_1">Remember
														my preference</label>
												</div>
											</div>
											<div class="form-group">
												<a href="/page-forgot-password">Forgot Password?</a>
											</div>
										</div>
										<div class="text-center">
											<button type="submit" formaction="/page-login"
												class="btn btn-primary btn-block">Sign Me In</button>
										</div>
									</form:form>
									<div class="new-account mt-3">
										<p>
											Don't have an account? <a class="text-primary"
												href="./controller/page-register">Sign up</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!--**********************************
        Scripts
    ***********************************-->
	<!-- Required vendors -->
	<script src="/vendor/global/global.min.js" type="text/javascript"></script>
	<script src="/vendor/bootstrap-select/dist/js/bootstrap-select.min.js"
		type="text/javascript"></script>
	<script src="/js/custom.min.js" type="text/javascript"></script>
	<script src="/js/deznav-init.js" type="text/javascript"></script>

</body>
</html>