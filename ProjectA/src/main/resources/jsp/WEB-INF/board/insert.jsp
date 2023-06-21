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
<ul>
<li><a href="/board/list">list</a>
<li><a href="/board/detail/1">Detail</a>
</ul>
<section class="container">
	<form action="/board/insert" method="post">
		<div class="mb-3">
		<label for="bno">bno</label>
		<input class="form-control" id="bno" name="bno"  type="number" value="${count+1}" disabled="disabled">
		<input class="form-control" id="bno" name="bno"  type="hidden" value="${count+1}" >
		</div>
		<div class="mb-3">
		<label for="subject">subject</label>
		<input class="form-control" id="subject" name="subject" type="text">
		</div>
		<div class="mb-3">
		<label for="content">content</label>
		<textarea class="form-control" id="content" name="content" rows="10" cols="50"></textarea>
		</div>
		<div class="mb-3">
		<label for="writer">writer</label>
		<input class="form-control" id="writer" name="writer"  type="text" value="${username}" disabled="disabled">
		<input class="form-control" id="writer" name="writer"  type="hidden" value="${username}" >
		</div>
		<input class="form-control" type="submit">
</form>
</section>



<c:if test="${binding.hasErrors()})">
	<h3>Error</h3>
</c:if>

</body>
</html>