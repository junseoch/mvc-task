<%@page import="com.app.vo.PostVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 리스트</title>
</head>
<body>
	
	<%
		List<PostVO> posts = (List<PostVO>)request.getAttribute("posts");
	%>
	
	<table>
		<tr>
			<th>ID</th>
			<th>게시물 제목</th>
			<th>게시물 내용</th>
		</tr>
		
		<%
			for(int i = 0; i < posts.size(); i++){
		%>
			
		<tr>
			<td><%=posts.get(i).getId()%></td>
			<td>
				<a href="/mvc_task/read.post?id=<%=posts.get(i).getId()%>"><%=posts.get(i).getPostTitle()%></a>
			</td>
			<td><%=posts.get(i).getPostContent()%></td>
		</tr>
		
		<%
			}
		%>
		
	</table>
	
	<div>
		<button><a href="/mvc_task/write.post"/>등록</button>
	</div>
	
	
</body>
</html>