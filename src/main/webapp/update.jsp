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

	<%
		PostVO post = (PostVO)request.getAttribute("post");	
	%>

	<form action="/mvc_task/update-ok.post" method="get">
		<input name='id' type='hidden' value="<%=post.getId() %>" />
		<div>
			<p>게시글 제목<input name="postTitle" value="<%=post.getPostTitle()%>"/></p>
		</div>
		<div>
			<p>게시글 내용<input name="postContent" value="<%=post.getPostContent()%>" /></p>
		</div>
		<button>수정완료</button>
	</form>
</body>
</html>