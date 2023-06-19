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

<style type="text/css">
    .hide-overflow {
      white-space: nowrap;
      overflow: hidden;
      text-overflow: ellipsis;
      max-width: 100px; /* 최대 너비 설정 */
    }
</style>

</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
<h1>Hello World!</h1>
</div>
<a href="/">Home</a>


<section class="container">
	<table class="table">
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
					<td>${b.regDate}</td>
				</tr>	
			</c:forEach>
		</tbody>
	</table>
</section>
</body>
</html>