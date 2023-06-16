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

<table class="table">
	<tbody>
			<tr>
				<th>Bno</th>		<td>${detail.bno}</td>
				<th>subject</th>	<td>${detail.subject}</td>
				<th>content</th>    <td>${detail.content}</td>
				<th>writer</th>  	<td>${detail.writer}</td>
				<th>regDate</th>	<td>${detail.regDate}</td>
			</tr>	
	</tbody>
</table>

<menu class="btn-group">
		<a href="/board/insert" class="btn btn-primary">추가</a>
		<a href="/dept/update?deptno=${dept.deptno}" class="btn btn-secondary">수정</a>
		<a href="/dept/delete?deptno=${dept.deptno}" class="btn btn-danger">삭제</a>
	</menu>

</body>
</html>