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
<style>
* {
	margin: 0;
	padding:0;
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
	width: 600px;
	height: 600px;
	margin: 100px auto;
	
	box-shadow: 3px 3px 50px #e6e6e6;
	
	border-radius: 20px;
	
	position: relative;
}

.card-header {
	padding: 20px;
	text-align: center;
}

.card-header h1 {
	font-size: 30px;
	font-weight: 600;
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
	background-color: tomato;
	color: #fff;
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
	background-color: tomato;
	color: #fff;
	border-radius: 10px;
}
    
</style>

</head>
<body>
<div class="card">
	<div class="card-header"><h1>게시판</h1></div>
	<div class="card-body">
		<input type="search" placeholder="검색어를 입력하세요.">
			<a class="search" href="#">검색</a>
		
		<c:forEach var="b" items="${list}">
		<div class="content-box">
			<div class="check"><input type="checkbox" name="" id=""></div>
			<div class="title"><a href="/board/detail/${b.bno}">${b.subject}</a></div>
			<div class="delete"><button>X</button></div>
		</div>	
		</c:forEach>
		<ul class="number">
			<li><a href="#">&lt;</a></li>
			<li><a href="#" class="active">1</a></li>
			<li><a href="#" >2</a></li>
			<li><a href="#" >3</a></li>
			<li><a href="#" >4</a></li>
			<li><a href="#">&gt;</a></li>
		</ul>
		<div class="btn"><a href="/board/insert">글쓰기</a></div>
	</div>
	

</div>

    <ul>
      <li><a href="/">Home</a></li>
    </ul>
  <article>
    <h1>게시판</h1>
  </article>
	<table class="board">
		<thead>
			<tr>	
				<th>Bno</th>
				<th>subject</th>
				<th>content</th>
				<th>writer</th>
				<th>regDate</th>
			</tr>	
		</thead>
		<tbody>
			<c:forEach var="b" items="${list}">
				<tr>
					<td>${b.bno}</td>
					<td><a href="/board/detail/${b.bno}">${b.subject}</a></td>
					<td class="hide-overflow">${b.content}</td>
					<td>${b.writer}</td>
					<td><fmt:formatDate value="${b.regDate}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
</body>
</html>