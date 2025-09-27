package com.app.post.controller;

import java.io.IOException;	

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;

public class PostReadController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		// 단일 객체일 경우 Optional
		try {
			req.setAttribute("post", postDAO.select(id).orElseThrow(PostNotFoundException::new));
			
		} catch (PostNotFoundException e) {
			// 에러처리코드
		}
		
		// 값이 있으면 : Optional의 값을 리턴
		// 값이 없으면 : 예외 throw
		
		result.setPath("/read.jsp");

		
		return result;
	}

}
