<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="favicon.png">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.js"></script>

<title></title>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
<h1>Hello World!</h1>
</div>
<section class="container">
<c:choose>
<c:when test="${param.create ne null}">
 회원가입 성공
</c:when>
</c:choose>
<a href="/">Home</a>
<hr>
	<table class="table">
		<tbody>
			<tr><th>User_Id</th>       <td>${user.id}</td></tr>
			<tr><th>User_Password</th> <td>${user.password}</td></tr>
			<tr><th>User_Role</th>     <td>${user.role}</td></tr>
		</tbody>
	</table>
</section>
</body>
</html>