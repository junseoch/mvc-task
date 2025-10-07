<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 수정</title>
</head>
<body>
	<form action="/mvc_task/update-ok.post" method="post">
		<div>
			<input name="id" type="hidden" value="${post.id}" />
		</div>
		<div>
			<span>게시글 제목</span>
			<input name="postTitle"  value="${post.postTitle}"/>
		</div>
		<div>
			<span>게시글 내용</span>
			<input name="postContent" value="${post.postContent}"/>
		</div>
		<button type="button">작성 완료</button>
	</form>
</body>
</html>