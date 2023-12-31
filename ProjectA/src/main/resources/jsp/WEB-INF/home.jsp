<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
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

<title>home.jsp</title>
</head>
<body>
<h1>Home 화면</h1>
<hr>
name = <sec:authentication property="name"/>
<hr>
<ul>
<sec:authorize access="!isAuthenticated()">
	<li><a href="/user/login    ">/user/login</a></li>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<li><a href="/user/logout   ">/user/logout</a></li>
</sec:authorize>
	<li><a href="/board/page/1/5">list</a>	
</ul>
<hr>
<ul>

</body>
</html>