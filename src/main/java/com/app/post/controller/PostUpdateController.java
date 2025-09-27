package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;
import com.app.vo.PostVO;

public class PostUpdateController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		
		
		Long id = Long.parseLong(req.getParameter("id"));
		
		// postDAO.select(id) : 타입 VO
		// postDAO.select(id).orElseThrow();
		
		try {
			PostVO foundPost =  postDAO.select(id).orElseThrow(PostNotFoundException::new);
			req.setAttribute("post", foundPost);
		} catch (PostNotFoundException e) {
			result.setPath("/error.jsp");
			req.setAttribute("message", "에러");
		}
		// .post로 작성시 무한로딩 걸림!
		result.setPath("/update.jsp");
		return result;
	}

}
