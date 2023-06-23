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
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #666;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Container for flexboxes */
section {
  display: -webkit-flex;
  display: flex;
}

/* Style the navigation menu */
nav {
  -webkit-flex: 1;
  -ms-flex: 1;
  flex: 1;
  /* background: #ccc; */
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

/* Style the content */
article {
  -webkit-flex: 3;
  -ms-flex: 3;
  flex: 3;
  background-color: #f1f1f1;
  padding: 10px;
}

/* Style the footer */
footer {
  /* background-color: #777; */
  padding: 10px;
  text-align: center;
  /* color: white; */
}

/* Responsive layout - makes the menu and the content (inside the section) sit on top of each other instead of next to each other */
@media (max-width: 600px) {
  section {
    -webkit-flex-direction: column;
    flex-direction: column;
  }
}
    .hide-overflow {
      white-space: nowrap;
      overflow: hidden;
      text-overflow: ellipsis;
      max-width: 100px; /* 최대 너비 설정 */
    }
    
    .board {
  width: 100%;
  border-collapse: collapse;
}

.board th, .board td {
  padding: 10px;
  text-align: center;
  border: 1px solid #ccc;
}

.board thead {
  background-color: #f2f2f2;
}

.board tbody tr:nth-child(even) {
  background-color: #f9f9f9;
}

.board tbody tr:hover {
  background-color: #e6e6e6;
}
    
</style>

</head>
<body>
<header>
<h1>Hello World!</h1>
</header>

<section>
  <nav>
    <ul>
      <li><a href="/">Home</a></li>
    </ul>
  </nav>
  <article>
    <h1>게시판</h1>
  </article>
</section>
<footer>
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
</footer>
</body>
</html>