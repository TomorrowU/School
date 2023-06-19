<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/favicon.png">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>update.jsp</title>
</head>
<body>
<h1>Update 수정</h1>
<hr>
<a href="/">Home</a>
<hr>
<a href="/board/list">/board/list</a>
<hr>
<section class="container">
	<form action="/board/update" method="post">
		<div class="mb-3">
			<label class="form-lable mb-2" for="bno">bno<span>*</span></label>
			<input class="form-control"    id="bno" name="bno"  value="${board.bno}" disabled="disabled"/>
			<input class="form-control"    id="bno" name="bno"  value="${board.bno}" type="hidden"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="subject">subject<span>*</span></label>
			<input class="form-control"    id="subject"  name="subject" value="${board.subject}"/>
		</div>
		<%-- <div class="mb-3">
			<label class="form-lable mb-2" for="writer">writer</label>
			<input class="form-control"    id="writer"	   name="writer"  value="${board.writer}" disabled="disabled"/>
			<input class="form-control" type="hidden"   id="writer"	   name="writer"  value="${board.writer}" />
		</div> --%>
		<div class="mb-3">
			<label class="form-lable mb-2" for="content">content<span>*</span></label>
			<textarea style=" resize: none;" id="contetn" name="content" class="form-control" rows="20" cols="40">${board.content}</textarea>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>	
</section>
<hr>
<c:if test="${binding.hasErrors()}">
<h2>Error Massage</h2>
<hr>
<c:forEach var="g" items="${binding.globalErrors}">
	<div>${g.code} ${g.defaultMessage}</div>
</c:forEach>
<hr>
<c:forEach var="f" items="${binding.fieldErrors}">
	<div>${f.field} ${f.defaultMessage}</div>
</c:forEach>

</c:if>

</body>
</html>