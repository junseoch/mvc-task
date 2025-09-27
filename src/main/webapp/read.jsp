<%@page import="com.app.vo.PostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>
   <%
      PostVO post = (PostVO)request.getAttribute("post");
   %>
   <div>
      <h1>제목: <%=post.getPostTitle() %></h1>
      <p>내용: <%=post.getPostContent() %></p>
   </div>
   <div>
      <a href="/mvc_task/list.post">게시물 목록</a>
      <a href="/mvc_task/update.post?id=<%=post.getId() %>">게시물 수정</a>
      <a href="/mvc_task/delete-ok.post?id=<%=post.getId() %>">게시물 삭제</a>
   </div>
</body>
</html>