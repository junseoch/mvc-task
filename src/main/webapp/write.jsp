<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	
	<form action="/mvc_task/write-ok.post" method="get">
	
		<div>
			<p>게시글 제목<input name="postTitle"/></p>
		</div>
		<div>
			<p>게시글 내용<input name="postContent"/></p>
		</div>
	
		<a href="/mvc_task/list.post"><button>작성완료</button></a>
	</form>
</body>
</html>