package com.app.post.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Action;
import com.app.Result;
import com.app.dao.PostDAO;
import com.app.exception.PostNotFoundException;
import com.app.vo.PostVO;

public class PostUpdateController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostDAO postDAO = new PostDAO();
		Optional<PostVO> post = null;
		Long id = null;
		id = Long.parseLong(req.getParameter("id"));
		
			post = postDAO.select(id);
		
		req.setAttribute("post", post);
		result.setPath("/update.jsp");
		return result;
	}
}
