
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 리스트</title>
</head>
<body>		
	<table>
		<tr>
			<th>ID</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
		
		<c:forEach var="post" items="${posts}">
			<tr>
				<td>${post.id}</td>
				<td>${post.postTitle}</td>
				<td>${post.postContent}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="/mvc_task/write.post">추가하기</a>
</body>
</html>
