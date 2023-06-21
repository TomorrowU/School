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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title></title>

<script type="text/javascript">
</script>

<style type="text/css">


</style>

</head>


<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
<h1>Hello World!</h1>
</div>


<a href="/board/list">list</a>

<section class="container">
	<table class="table">
		<tbody>
				<tr>
					<th>Bno</th>		<td>${detail.bno}</td>
					<th>subject</th>	<td>${detail.subject}</td>
					<th>writer</th>  	<td>${detail.writer}</td>
					<th>regDate</th>	<td><fmt:formatDate value="${detail.regDate}" pattern="yyyy.MM.dd HH:mm:ss"/></td>
				</tr>	
		</tbody>
	</table>
	<div class="well" style="">
	<p>${detail.content}</p>
	</div>
	
	<div class="container">
        <label for="content">comment</label>
        <form name="commentInsertForm">
            <div class="input-group">
               <input type="hidden" name="bno" value="${detail.bno}"/>
               <input type="text" class="form-control" id="content" name="content" placeholder="내용을 입력하세요.">
               <span class="input-group-btn">
                    <button class="ml-3 btn btn-secondary" type="button" name="commentInsertBtn">등록</button>
               </span>
              </div>
        </form>
    </div>
<div class="container">
        <div class="commentList"></div>
</div>
	
	<h3>${detail.bno}</h3>
	
<menu class="btn-group">
		<a href="/board/insert" class="btn btn-primary">추가</a>
		<a href="/board/update?bno=${detail.bno}" class="btn btn-secondary">수정</a>
		<a href="/board/delete?bno=${detail.bno}" class="btn btn-danger">삭제</a>
</menu>
</section>

<%@ include file ="commentS.jsp" %>

<script type="text/javascript">

let name = '작성자 : ${username}'
window.onload = function() {
	  // 웹 페이지가 로드된 후 실행할 코드 작성
	   
	   /* setTimeout(function() {
       console.log("로드 후 1초가 지났습니다.");
       var creater = Array.from(document.getElementsByClassName('creater'));
       var a = Array.from(document.getElementsByClassName('a'));
       var b = Array.from(document.getElementsByClassName('b'));
       for(var i=0; i<creater.length;i++){
       		if(name!=creater[i].textContent){
       			console.log(creater[i]);
       			a[i].style.display="none";
       			b[i].style.display="none";
       		}
       }
       
	   },100); 
	  console.log("웹 페이지가 로드되었습니다."); */
		repeatTimeout();
	};


 	function repeatTimeout(){	 
		setTimeout(function() {
	       console.log("로드 후 1초가 지났습니다.");
	       var creater = Array.from(document.getElementsByClassName('creater'));
	       var a = Array.from(document.getElementsByClassName('a'));
	       var b = Array.from(document.getElementsByClassName('b'));
	       for(var i=0; i<creater.length;i++){
	       		if(name!=creater[i].textContent){
	       			console.log(creater[i]);
	       			a[i].style.display="none";
	       			b[i].style.display="none";
	       		}
	    	}
	       console.log(11);
	       repeatTimeout();
		},10); 
 	}


</script>


</body>
</html>