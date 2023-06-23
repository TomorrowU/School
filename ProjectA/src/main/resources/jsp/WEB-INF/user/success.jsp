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
<link href="https://webfontworld.github.io/gmarket/GmarketSans.css" rel="stylesheet">
<title></title>

<style type="text/css">
* {
	margin: 0;
	padding:0;
	font-family: 'GmarketSans';
	font-size: 30px;
}	

li {
	list-style: non;
}	
	
a {
	color: inherit;
	text-decoration: none;
}	

head {
	display: none;
}

body {
	display: block;
}

.card {
	width: 1600px;
	height: 700px;
	margin: 100px auto;
	
	box-shadow: 3px 3px 50px #e6e6e6;
	
	border-radius: 20px;
	
	position: relative;
}
ul li:nth-child(odd) {
  background-color: #f1f1f1; /* 홀수 아이템 배경색 */
}
.card-header {
	
	text-align: center;
	background-color: #242424;
	color: #78b862;
}

.card-header h1 {
	font-size: 30px;
	font-weight: 600;
	margin-top: 0.5rem;
}

.card-body {
	padding: 20px;
	text-align: center;
}

.card-body input[type="search"] {
	padding: 10px;
	
	margin-bottom: 10px;
	border: 1px solid #999;
	border-radius: 10px;
	width: 300px;
	font-size: 16px;
}	

.card-body a.search {
	padding: 10px 15px 10px 15px;
	margin-left: 10px;
	border-radius: 10px;
	background-color: #78b862;
	color: #242424;
	text-align: center;
	font-size: 22px;
	font-weight: bold;
}

.card-body div {
	margin-top: 10px;
	border-bottom: 1px solid #e6e6e6;
}

.card-body div div {
	display: inline-block;
	padding: 15px 10px 15px 10px;
	margin: 0;
	border: none;
}

.card-body .check , delete {
	width: 5%;
}

.card-body .title {
	width: 70%;
	text-align: left;
}

.card-body .delete button {
	background-color: #fff;
	border: none;
}

.number {
	padding: 10px;
}

.number li {
	display: inline-block;
}

number li a {
	display: block;
	width: 40px;
	line-height: 40px;
	border-radius: 10px;
	margin: 3px;
	margin-top: 20px;
	box-shadow: 0 5px 10px #f1f1f1;
}

.number li a.active {
	background-color: rgb(252,212,205);
}

.btn {
	position: absolute;
	right: 0;
	bottom: 0;
	padding: 10px;
	margin: 10px 10px 20px 10px;
}

.btn a {
	padding: 10px;
	background-color: #78b862;
	color: #242424;
	border-radius: 10px;
}

</style>

</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
</div>
<section class="container">
<c:choose>
<c:when test="${param.create ne null}">
 <h2 style="text-align: center; margin-top: 20px;"><a href="/">회원가입 성공</a></h2>
</c:when>
</c:choose>
<hr>
	<table class="table">
		<tbody>
			<tr><th>아이디</th>       <td>${user.id}</td></tr>
			<tr><th>비밀번호</th> <td>${user.password}</td></tr>
			<tr><th>이메일</th>     <td>${user.role}</td></tr>
		</tbody>
	</table>
</section>
<div class="container-fluid p-5 bg-primary text-white text-center">
</div>
</body>
</html>